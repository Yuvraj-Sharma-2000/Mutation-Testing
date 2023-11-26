package dsa.solutions.microsoft;

public class StringConcatenation {
    static boolean isPossible(String str1, String str2)
    {
        for(int i=0;i<str2.length();i++)
            if(str1.contains(""+str2.charAt(i)))
                return false;

        return true;
    }
    static int solve(int i,String str, String[] arr)
    {
        if(i==arr.length)
            return str.length();

        int include = 0;
        if(arr[i]!=null && isPossible(str,arr[i]))
            include = solve(i+1,str+arr[i],arr);

        int exclude = solve(i+1,str,arr);
        return Math.max(include, exclude);
    }
    public static int stringConcatenation(String[] arr) {

        for(int k=0;k<arr.length;k++)
        {
            String str = arr[k];
            if(str==null)
                continue;
            int[] freq = new int[26];
            for(int i=0;i<str.length();i++){
                freq[str.charAt(i)-'a']++;
                if(freq[str.charAt(i)-'a']>1){
                    arr[k] = null;
                    break;
                }
            }
        }

        return solve(0,"",arr);
    }
}
