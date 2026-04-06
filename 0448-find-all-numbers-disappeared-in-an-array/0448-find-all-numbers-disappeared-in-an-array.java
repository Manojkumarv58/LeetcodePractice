class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> al=new ArrayList<>();
        boolean ap[]=new boolean[n+1];
      for(int i=0;i<n;i++){
        ap[nums[i]]=true;
      }
 for(int i=1;i<=n;i++){
    if(!ap[i]) al.add(i);


 }
return al;
    }
}