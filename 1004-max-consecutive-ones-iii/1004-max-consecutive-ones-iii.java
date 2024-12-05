class Solution {
    public int longestOnes(int[] nums, int k) {
         int left = 0, maxLength = 0, zeroCount = 0;
        
        for (int right = 0; right < nums.length; right++) {
            // Expand the window
            if (nums[right] == 0) {
                zeroCount++;
            }
            
            // Shrink the window if the number of 0s exceeds k
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            
            // Update the maximum length of the window
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    
    }
}