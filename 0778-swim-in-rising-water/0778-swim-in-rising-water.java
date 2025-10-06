class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; ++i) Arrays.fill(dist[i], Integer.MAX_VALUE);

        // min-heap: {time, row, col}
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        dist[0][0] = grid[0][0];
        pq.offer(new int[]{dist[0][0], 0, 0});

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int t = cur[0], r = cur[1], c = cur[2];

            // If current popped state is obsolete, skip
            if (t > dist[r][c]) continue;

            // If reached destination, t is the answer
            if (r == n - 1 && c == n - 1) return t;

            // Explore neighbors
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                    int nt = Math.max(t, grid[nr][nc]); 
                    if (nt < dist[nr][nc]) {
                        dist[nr][nc] = nt;
                        pq.offer(new int[]{nt, nr, nc});
                    }
                }
            }
        }

        return -1; 
    }
}