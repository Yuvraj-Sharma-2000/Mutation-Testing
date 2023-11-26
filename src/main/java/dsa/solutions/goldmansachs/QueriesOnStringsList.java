package dsa.solutions.goldmansachs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class QueriesOnStringsList {
    static class Bucket {
        public SortedSet<String> strSet;
        public int prev;
        public int next;

        Bucket(){
            this.strSet = new TreeSet<String>();
            this.prev = 0;
            this.next = 0;
        }
    }

        public static void updatePointerOnAdd(Bucket[] buckets, int[] head, int[] tail, int id) {
            // If list/array is empty before 'Add' query.
            if (head[0] == 0 && tail[0] == 0) {
                head[0] = 1;
                tail[0] = 1;
                return;
            }

            if (buckets[id].prev != 0 || buckets[id].next != 0) {
                // Do nothing because pointers are already set.
            } else if (id < head[0]) {
                // This bucket will be new head.
                buckets[id].next = head[0];
                head[0] = id;
            } else {
                buckets[id].next = buckets[id - 1].next;
                buckets[id].prev = id - 1;
                tail[0] = Math.max(tail[0], id);
            }

            if (id == 1) {
                // Do nothing.
            } else if (buckets[id - 1].strSet.size() > 0) {
                buckets[id - 1].next = id;
            } else {
                if (head[0] == id - 1) {
                    head[0] = id;
                    buckets[id].prev = 0;
                } else {
                    int prev = buckets[id - 1].prev;
                    buckets[prev].next = id;
                    buckets[id].prev = prev;
                }
                buckets[id - 1].prev = 0;
                buckets[id - 1].next = 0;
            }
        }

        public static void updatePointerOnRem(Bucket[] buckets, int[] head, int[] tail, int id) {
            if (id == 0 || buckets[id].prev != 0 || buckets[id].next != 0) {
                // Do nothing as pointers are already set correctly.
            } else if (id < head[0]) {
                buckets[id].next = id + 1;
                head[0] = id;
            } else {
                buckets[id].next = id + 1;
                buckets[id].prev = buckets[id + 1].prev;
            }

            if (buckets[id + 1].strSet.size() > 0) {
                buckets[id + 1].prev = id;
            } else {
                if (head[0] == id + 1) {
                    head[0] = buckets[id + 1].next;
                    buckets[head[0]].prev = 0;
                }
                buckets[id].next = buckets[id + 1].next;
                if (tail[0] == id + 1) {
                    tail[0] = id;
                }
                buckets[id + 1].next = 0;
                buckets[id + 1].prev = 0;
            }
        }

        public static ArrayList<String> stringQueries(ArrayList<ArrayList<String>> queries) {
            int n = queries.size();
            Bucket[] buckets = new Bucket[n + 1];

            for (int i = 0; i <= n; i++)
                buckets[i] = new Bucket();

            HashMap<String, Integer> freq = new HashMap<>();
            int[] head = new int[1];
            int[] tail = new int[1];
            head[0] = 0;
            tail[0] = 0;

            ArrayList<String> result = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String first = queries.get(i).get(0);

                if (first.equals("Add")) {
                    String second = queries.get(i).get(1);
                    freq.put(second, freq.getOrDefault(second, 0) + 1);

                    int id = freq.get(second);
                    // Insert and remove key from required buckets.
                    buckets[id].strSet.add(second);
                    if (id > 1) {
                        buckets[id - 1].strSet.remove(second);
                    }

                    // Update Pointers.
                    updatePointerOnAdd(buckets, head, tail, id);

                } else if (first.equals("Rem")) {
                    String second = queries.get(i).get(1);

                    int id = freq.get(second) - 1;
                    if (id == 0) {
                        // Remove key if its value is 1.
                        freq.remove(second);
                    } else {
                        // Decrement value of key by 1.
                        freq.put(second, freq.get(second) - 1);
                    }

                    // Insert and remove key from required buckets.
                    if (id > 0) {
                        buckets[id].strSet.add(second);
                    }
                    buckets[id + 1].strSet.remove(second);

                    if (freq.size() == 0) {
                        // If list/array becomes empty.
                        head[0] = 0;
                        tail[0] = 0;
                        buckets[id + 1].prev = 0;
                        buckets[id + 1].next = 0;
                        continue;
                    }

                    // Update Pointers.
                    updatePointerOnRem(buckets, head, tail, id);

                } else if (first.equals("GetMaxKey")) {
                    String maxFrekey = (buckets[tail[0]].strSet.first());
                    result.add(maxFrekey);
                } else {
                    String minFrekey = (buckets[head[0]].strSet.first());
                    result.add(minFrekey);
                }
            }

            return result;
    }
}
