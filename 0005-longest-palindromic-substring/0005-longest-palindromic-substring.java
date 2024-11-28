class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
         if (s == null || n < 1) {
        return "";
    }
       String longP="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String subst=s.substring(i,j);
                if(isPalindrome(subst)&&subst.length() > longP.length()){
                    longP=subst;
                }
            }
        }
        return longP;
        
    }
    public static boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))return false;
            left++;
            right--;
        }
        return true;
    }
}