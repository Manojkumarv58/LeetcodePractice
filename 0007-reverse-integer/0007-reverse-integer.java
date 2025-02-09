class Solution {
    public int reverse(int x) {
        long rd=x<0?reverseDigit(x*-1,0):reverseDigit(x,0);
        if(rd > Integer.MAX_VALUE || rd<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*rd);
        }
        return (int)rd;
    }
      public long reverseDigit(long n, long sum){
    
        if(n==0){
            return sum;
        }
        sum=(sum*10)+n%10;
        return reverseDigit(n/10,sum);
    }
}