/*------------------------------------------
 CURRENT DATE=25/04/2024, TIME=10:54
---------------------------------------------*/
public class LongestCommonSubsequence {
    
    public static int findLCSLength(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        
        int[][] dynamic = new int[m + 1][n + 1];
        
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    dynamic[i][j] = 0; 
                else if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dynamic[i][j] = dynamic[i - 1][j - 1] + 1; 
                else
                    dynamic[i][j] = Math.max(dynamic[i - 1][j], dynamic[i][j - 1]);
            }
        }
        
        return dynamic[m][n];
    }
    public static void main(String[] args) {
        String str1 = "ADARSH";
        String str2 = "ASDJKN";
        int lcsLength = findLCSLength(str1, str2);
        System.out.println("Length of Longest Common Subsequence: " + lcsLength);
    }
}
