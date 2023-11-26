package dsa.solutions.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ElliotAndHisWebsite {
    public static ArrayList<String> getUsernames(int n, ArrayList<String> usernames)
    {
        ArrayList<String> ans = new ArrayList<>();
        Map<String, Integer> m = new HashMap<>();

        // Brute force Approach no trick
        // Just try to append numbers from 0,1,2...
        // until new username is not found in the map
        for (int i = 0; i < n; i++) {
            // If new username then directly add to answer
            if (m.getOrDefault(usernames.get(i), 0) != 1) {
                ans.add(usernames.get(i));
                m.put(usernames.get(i), 1);
                // Username exists
            } else {
                String s = usernames.get(i);
                int j = 0;
                while (m.getOrDefault(s, 0) == 1) {
                    // try username0,username1,username2,...
                    s = usernames.get(i) + Integer.toString(j);
                    j++;
                }
                // Add new username to answeer an
                ans.add(s);
                m.put(s, 1);
            }
        }
        return ans;
    }
}
