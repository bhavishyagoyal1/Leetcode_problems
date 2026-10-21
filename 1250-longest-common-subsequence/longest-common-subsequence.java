class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length()+1;
        int n = s2.length()+1;

        int [][]dp = new  int[m][n];

        for(int i = 1; i < m;i++){
            for(int j = 1;j < n;j++){
                char ch1 = s1.charAt(i-1); // s1 character
                char ch2 = s2.charAt(j-1); // s2 character

                if(ch1 == ch2){  // match
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[m-1][n-1];
    }
}