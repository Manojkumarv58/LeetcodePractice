class Solution {
    public int hammingWeight(int n) {
int t=0;
        while(n>0){
            n=n&(n-1);
            t++;
        }
        return t;
    }
}