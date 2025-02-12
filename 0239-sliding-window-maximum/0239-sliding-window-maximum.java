class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
         if (nums == null || nums.length == 0 || k <= 0) return new int[0];
    
    int n = nums.length;
    int[] result = new int[n - k + 1];
    
    for (int i = 0; i <= n - k; i++) {
        int max = nums[i];
        for (int j = i + 1; j < i + k; j++) {
            max = Math.max(max, nums[j]);
        }
        result[i] = max;
    }
    
    return result;
    }
}