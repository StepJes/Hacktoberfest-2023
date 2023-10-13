/*
    Longest Common Subsequence problem using Tabulation.

    A subsequence of a string is a new string generated from the original string with some characters (can be none) dleted without changing the relative order of the remaining characters.
*/

import java.util.*;

public class LongestCommonSubsequenceCode {

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        int[][] val = new int[str1.length() + 1][str2.length() + 1];
        for (int[] row : val) {
            for (int i = 0; i < row.length; i++) {
                row[i] = -1;
            }
        }

        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val[0].length; j++) {
                if (i == 0 || j == 0) {
                    val[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < val.length; i++) {
            for (int j = 1; j < val[0].length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    val[i][j] = val[i - 1][j - 1] + 1;
                } else {
                    val[i][j] = Math.max(val[i - 1][j], val[i][j - 1]);
                }
            }
        }
        System.out.println(val[str1.length()][str2.length()]);
    }
}
