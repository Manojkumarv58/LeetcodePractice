class Solution {
    public int firstMissingPositive(int[] arr) {
        HashSet<Integer> s=new HashSet<>();
        for(int i:arr){
            s.add(i);
        }
        
        int i=1;
        while(true){
            if(!s.contains(i)) return i;
            i++;
        }
    }
}