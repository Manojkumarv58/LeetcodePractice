class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
             if(arr[i]==arr[i+1]){
                ans.add(arr[i]);
             }
        }
        return ans;
    }
}