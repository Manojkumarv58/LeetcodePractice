class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int increasing = 1;       // length of current strictly increasing run
        int prevIncreasing = 0;   // length of previous run before a break

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                increasing++;
            } else {
                // the strictly increasing run ended
                prevIncreasing = increasing;
                increasing = 1;
            }
            // check if possible to have two adjacent subarrays of length k
            if (increasing / 2 >= k || Math.min(prevIncreasing, increasing) >= k) {
                return true;
            }
        }

        return false;
    }
}
