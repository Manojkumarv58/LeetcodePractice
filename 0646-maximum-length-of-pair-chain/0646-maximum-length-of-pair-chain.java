class Solution {
    public int findLongestChain(int[][] pairs) {
           Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
           int current=Integer.MIN_VALUE;
           int count=0;
           for(int[] pair:pairs){
            if(pair[0]>current){
                count++;
                current=pair[1];
            }
           }
           return count;
    }
}