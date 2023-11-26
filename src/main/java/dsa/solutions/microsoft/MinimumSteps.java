package dsa.solutions.microsoft;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinimumSteps {
    public static int minimumSteps(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int n = arr.length;;
        Arrays.stream(arr).forEach(set::add);

        int gap = set.size()-1;
        Arrays.sort(arr);
        int steps = 0;
        for(int i=0,j=n-1;arr[i]!=arr[j];j--)
        {
            int len = 1;
            while(j>=0 && arr[j]==arr[j-1]){
                j--;
                len++;
            }
            steps += gap*len;
            gap--;
        }
        return steps;
    }
}
