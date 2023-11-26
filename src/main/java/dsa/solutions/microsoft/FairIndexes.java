package dsa.solutions.microsoft;

public class FairIndexes {

    public static int totalIndexes(int[] A, int[] B){
        int n = A.length;
        int[] prefixA = new int[n];
        int[] prefixB = new int[n];

        prefixA[0] = A[0];
        prefixB[0] = B[0];

        for(int i=1;i<n;i++)
        {
            prefixA[i] += prefixA[i-1]+A[i];
            prefixB[i] += prefixB[i-1]+B[i];
        }

        int count = 0;
        for(int i=0;i<n-1;i++)
            if(2*prefixA[i]==prefixA[n-1] && 2*prefixB[i]==prefixB[n-1] && prefixA[i]==prefixB[i])
                count++;

        return count;
    }
}
