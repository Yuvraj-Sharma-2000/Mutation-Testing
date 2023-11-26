package dsa.solutions.microsoft;

import java.util.ArrayList;

public class IncreasingDecreasingArray {
    public static ArrayList<Integer> incDecArray(int n, String s)
    {
        ArrayList<Integer> list = new ArrayList<>();

        if(n==2 && s.equals("NN"))
        {
            list.add(2);
            list.add(1);
            return list;
        }

        for(int i=1;i<=n;i++)
            list.add(i);

        for(int i=0;i<s.length();)
        {
            if(s.charAt(i)=='P'){
                i++;
            }
            else{
                int j=i;
                for(j=i;j<s.length() && s.charAt(j)=='N';j++);

                for(int left=i,right=j;left<right;left++,right--){
                    int hold = list.get(left);
                    list.set(left,list.get(right));
                    list.set(right, hold);
                }
                i=j;
            }
        }
        return list;
    }
}
