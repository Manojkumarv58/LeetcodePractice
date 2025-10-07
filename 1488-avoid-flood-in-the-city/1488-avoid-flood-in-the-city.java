import java.util.*;

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Map<Integer, Integer> fullLakes = new HashMap<>(); // lake -> last rain day
        TreeSet<Integer> dryDays = new TreeSet<>();        // indices of zero days

        for (int i = 0; i < n; i++) {
            int lake = rains[i];
            if (lake == 0) {
                dryDays.add(i);
                ans[i] = 1; // default value, will adjust later
            } else {
                ans[i] = -1; // raining day
                if (fullLakes.containsKey(lake)) {
                    // find dry day after previous rain
                    Integer dryDay = dryDays.higher(fullLakes.get(lake));
                    if (dryDay == null) return new int[0]; // flood unavoidable
                    ans[dryDay] = lake; // dry this lake
                    dryDays.remove(dryDay);
                }
                fullLakes.put(lake, i);
            }
        }

        return ans;
    }
}
