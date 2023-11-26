package dsa.solutions.amazon;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithAtMostKDistinctCharacters {
    public static int kDistinctChars(int k, String str) {
        if(str.length() == 0)
            return 0;

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int l = 0;
        int r = 0;
        int n = str.length();
        // While string not exhausted
        while(r < n)
        {
            // Pick the right character and add its frequency
            char c = str.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);

            // If exceeded K disitnct
            while(map.size() > k)
            {
                char leftChar = str.charAt(l);
                // Decrease left character frequency
                map.put(leftChar, map.get(leftChar) - 1);
                // If left char has no frequency then remove it
                if(map.get(leftChar) == 0)
                    map.remove(leftChar);

                // Do this while distinct<=k
                l++;
            }
            // Store current distinct<=k answer
            max = Math.max(r - l + 1, max);
            // Move right
            r++;
        }
        return max;
    }
}