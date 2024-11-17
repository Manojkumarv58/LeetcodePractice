class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxNormal=kadane(nums);
        if(maxNormal<0)return maxNormal;
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
            nums[i]=-nums[i];
        }
        int maxCircular=totalSum+kadane(nums);
        return Math.max(maxNormal,maxCircular);
    }
    private static int kadane(int[] nums){
        int currentMax=nums[0];
        int globalMax=nums[0];
        for(int i=1;i<nums.length;i++){
            currentMax=Math.max(nums[i],currentMax+nums[i]);
            globalMax=Math.max(globalMax,currentMax);
        }
        return globalMax;
    }
}