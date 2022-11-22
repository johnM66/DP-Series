package com.dp.series.subsetsum;

public class SubSetSumMemoization {

    public static void main(String[] args) {
        int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++)
            for (int j = 0; j < sum + 1; j++) {
                dp[i][j] = Boolean.FALSE;
            }
        System.out.println(subSetSumMemo(set, sum, n,dp));
    }

    private static boolean subSetSumMemo(int[] set, int sum, int n, boolean[][] dp) {

        if (n == 0)
            return false;
        if (sum == 0)
            return true;
        if (set[n - 1] <= sum) {
            return dp[n][sum] = subSetSumMemo(set, sum - set[n - 1], n - 1, dp) || subSetSumMemo(set, sum, n - 1, dp);
        } else {
            return dp[n][sum] = subSetSumMemo(set, sum, n - 1, dp);
        }
    }


}
