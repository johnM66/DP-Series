package com.dp.series.subsetsum;

public class SubSetSumMemoization {

    public static void main(String[] args) {
        int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;
         subSetSumMemo(set, sum, n);
    }

    private static void subSetSumMemo(int[] set, int sum, int n) {
        boolean[][] dp = new boolean[n+1][sum+1];
        for (int i = 0; i <= n+1; i++)
            for (int j = 0; j <= sum+1; j++) {
                dp[i][j] = false;
            }
    }



}
