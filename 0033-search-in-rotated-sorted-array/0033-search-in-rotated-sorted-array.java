class Solution {
    public int search(int[] nums, int target) {
        
        int low=0;
        int r=nums.length-1;
        while(low<=r){
            int mid=(r+low)/2;
            if(nums[mid]==target){
                return mid;
            }
            
           else if(nums[low]<=nums[mid]){
            if(nums[low]<=target && nums[mid]>target){
                r=mid-1;
            }else{
                low=mid+1;
            }
           }
           else {
            if(target>nums[mid]&& target<=nums[r]){
                low=mid+1;
            }else{
                r=mid-1;
            }
           }


        }
        return -1;
    }
}