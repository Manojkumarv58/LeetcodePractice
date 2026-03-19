public class Solution {
    int dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        
        int m = text1.length();
        int n = text2.length();
dp=new int[m+1][n+1];
for(int[] rows:dp){
    Arrays.fill(rows,-1);
           }
      


return lcs(text1,text2,m,n);

    }
    public int lcs(String a,String b,int m,int n){
    if(m==0||n==0)return 0;
    if(dp[m][n]!=-1)return dp[m][n];
    if(a.charAt(m-1)==b.charAt(n-1))return dp[m][n]=1+lcs(a,b,m-1,n-1);
    else return dp[m][n]= Math.max(lcs(a,b,m-1,n),lcs(a,b,m,n-1));

    }
}
