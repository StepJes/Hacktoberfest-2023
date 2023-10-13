/*
    Rod Cutting Problem using Tabulation Method.

    Given : Rod --> 'n' inches (length)
            Array of prices for all pieces of size smaller than n.
    Determine : Maximum value obtained by cutting up rod and selling pieces.
*/ 

public class RodCuttingCode {
    public static void main(String[] args) {
        int[] length = {1,2,3,4,5,6,7,8};
        int[] price = {1,5,8,9,10,17,17,20};
        int rodLen = 8;
        int[][] dp = new int[length.length + 1][rodLen + 1];

        // initializing 1st row and 1st col as 0

        for (int i = 1; i < length.length + 1; i++) {
            for (int j = 1; j < rodLen + 1; j++) {
                int p = price[i - 1];
                // int l = length[i - 1]; --> i
                if(i <= j) { // valid cond
                    dp[i][j] = Math.max(p + dp[i][j - i], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[rodLen][rodLen]);
    }
}
