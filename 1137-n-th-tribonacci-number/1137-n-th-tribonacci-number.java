class Solution {
    public int tribonacci(int n) {
        int t0=0,t1=1,t2=1;
      int  tn=0;
      if(n==1 ||n==2)return 1;
        for(int i=3;i<=n;i++){
         tn=t0+t1+t2;
         t0=t1;
         t1=t2;
         t2=tn;
        }
        return tn;
    }
}