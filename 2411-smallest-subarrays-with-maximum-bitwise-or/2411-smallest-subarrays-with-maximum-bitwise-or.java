import java.util.*;

public class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] lastSeen = new int[32];  // stores the last index where each bit was seen

        for (int i = 0; i < 32; i++) {
            lastSeen[i] = -1; // initialize all bits as not seen
        }

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // update lastSeen bits
            for (int b = 0; b < 32; b++) {
                if ((nums[i] & (1 << b)) != 0) {
                    lastSeen[b] = i;
                }
            }

            // get the farthest index needed to achieve max OR
            int farthest = i;
            for (int b = 0; b < 32; b++) {
                if (lastSeen[b] != -1) {
                    farthest = Math.max(farthest, lastSeen[b]);
                }
            }

            result[i] = farthest - i + 1; // +1 because length is (end - start + 1)
        }

        return result;
    }
}
