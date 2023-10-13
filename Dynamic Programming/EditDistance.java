/*
    Given : 2 Strings --> word1, word2
    Return : Minimum no. of operations required to convert word1 to word2
    Permitted operations : * Insert a character
                           * Delete a character
                           * Replace a character
*/ 

public class EditDistance {
    public static void EditDistance(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int[][] dp = new int[n+1][m+1];

        // initialization
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i == 0 || j == 0) {
                    dp[i][0] = i;
                    dp[0][j] = j;
                }
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1])) + 1;
                }
            }
        }
        System.out.println(dp[n][m]);
    }
    public static void main(String[] args) {
        String str1 = "intention";
        String str2 = "execution";
        EditDistance(str1, str2);
    }    
}
