package dsa.solutions.amazon;

import java.util.ArrayList;

public class BinaryArraySorting {
    public static ArrayList<Integer> sortBinaryArray(ArrayList<Integer> arr) {
        int zeros = 0;
        for(int i=0; i<arr.size(); i++)
            if(arr.get(i)==0)
                zeros++;

        ArrayList<Integer> ans = new ArrayList<>(arr.size());

        for(int i=0;i<arr.size();i++){
            if(zeros>0){
                zeros--;
                ans.add(0);
            }
            else{
                ans.add(1);
            }
        }
        return ans;
    }
}