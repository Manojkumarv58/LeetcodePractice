class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                ans.add(arr[i]);
            }
            set.add(arr[i]);
             
        }
        return ans;
    }
}