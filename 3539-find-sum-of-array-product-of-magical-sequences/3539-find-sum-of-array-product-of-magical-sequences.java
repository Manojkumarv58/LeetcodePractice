class Solution {
        static final int MOD = 1_000_000_007;

    public int magicalSum(int m, int k, int[] nums) {
        int n = nums.length;
        int maxBit = n + 10; // extra bits to handle carry propagation

        // Step 1: Precompute binomial coefficients
        long[][] C = new long[m + 1][m + 1];
        for (int i = 0; i <= m; i++) {
            C[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % MOD;
            }
        }

        // Step 2: Precompute power table
        long[][] power = new long[n][m + 1];
        for (int i = 0; i < n; i++) {
            power[i][0] = 1;
            for (int x = 1; x <= m; x++) {
                power[i][x] = (power[i][x - 1] * nums[i]) % MOD;
            }
        }

        // Step 3: DP state: (used, carry, ones) -> sum
        Map<String, Long> dp = new HashMap<>();
        dp.put("0,0,0", 1L);

        // Step 4: Process bit positions (including carries beyond n)
        for (int b = 0; b <= maxBit; b++) {
            Map<String, Long> newDp = new HashMap<>();

            if (b < n) {
                // Normal processing with nums[b]
                for (var entry : dp.entrySet()) {
                    String[] parts = entry.getKey().split(",");
                    int used = Integer.parseInt(parts[0]);
                    int carry = Integer.parseInt(parts[1]);
                    int ones = Integer.parseInt(parts[2]);
                    long val = entry.getValue();

                    int remaining = m - used;
                    if (remaining < 0) continue;

                    for (int x = 0; x <= remaining; x++) {
                        int total = x + carry;
                        int bit = total & 1;
                        int newCarry = total >> 1;
                        int newUsed = used + x;
                        int newOnes = ones + bit;
                        if (newOnes > k) continue;

                        long ways = (C[remaining][x] * power[b][x]) % MOD;
                        long newVal = (val * ways) % MOD;

                        String key = newUsed + "," + newCarry + "," + newOnes;
                        newDp.put(key, (newDp.getOrDefault(key, 0L) + newVal) % MOD);
                    }
                }
            } else {
                // Only carry propagates forward (no new picks)
                for (var entry : dp.entrySet()) {
                    String[] parts = entry.getKey().split(",");
                    int used = Integer.parseInt(parts[0]);
                    int carry = Integer.parseInt(parts[1]);
                    int ones = Integer.parseInt(parts[2]);
                    long val = entry.getValue();

                    int total = carry;
                    int bit = total & 1;
                    int newCarry = total >> 1;
                    int newOnes = ones + bit;
                    if (newOnes > k) continue;

                    String key = used + "," + newCarry + "," + newOnes;
                    newDp.put(key, (newDp.getOrDefault(key, 0L) + val) % MOD);
                }
            }

            dp = newDp;
        }

        // Step 5: Final result
        String key = m + ",0," + k;
        return dp.getOrDefault(key, 0L).intValue();
    }
}