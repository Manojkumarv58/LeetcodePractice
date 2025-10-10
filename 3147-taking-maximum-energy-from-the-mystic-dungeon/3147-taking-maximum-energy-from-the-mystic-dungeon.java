class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int ans = Integer.MIN_VALUE;

        int[] dp = new int[n];
        for (int i = n - 1; i >= 0; --i) {
            int next = (i + k < n) ? dp[i + k] : 0;
            dp[i] = energy[i] + next;
            if (dp[i] > ans) ans = dp[i];
        }
        return ans;
    }
}
