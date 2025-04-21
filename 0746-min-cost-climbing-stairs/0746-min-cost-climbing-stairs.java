class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prv=0,next=0;
        for(int i=2;i<=cost.length;i++){
            int curr=Math.min(prv+cost[i-1],next+cost[i-2]);
            next=prv;
            prv=curr;
        }
        return prv;
    }
}