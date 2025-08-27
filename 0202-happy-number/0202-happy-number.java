class Solution {
    public boolean isHappy(int n) {
        int slow=n,fast=next(n);
        while(fast!=1&& slow!=fast){
            slow=next(slow);
            fast=next(next(fast));
        }

return fast==1;

    }
    public int next(int n){
        int sum=0;
        while(n>0){
          int  r=n%10;
            sum+=r*r;
            n/=10;
        }
        return sum;
    }
}