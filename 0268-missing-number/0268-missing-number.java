class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
       int totalsum=(n*(n+1))/2;
       int currentsum=0;
       for(int num:nums){
        currentsum+=num;
       }
       return totalsum-currentsum;
    }
}