package dsa.solutions.amazon;

public class UniquePaths {
    static int solveTab(int n, int m)
    {
        int[][] dp = new int[n][m];

        for(int i=n-1;i>=0;i--)
            for(int j=m-1;j>=0;j--)
                if(i==n-1 || j==m-1)
                    dp[i][j] = 1;
                else
                    dp[i][j] += dp[i][j+1] + dp[i+1][j];

        return dp[0][0];
    }
    public static int uniquePaths(int m, int n) {

        if(m==1 || n==1)
            return 1;

        return solveTab(m,n);
    }
}
