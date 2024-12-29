class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[]{-1,-1};
        if(arr.length==0) return arr;
        int right=nums.length-1;
        int leftoc=findLeft(nums,target,0,right);
        int rightoc=findRight(nums,target,0,right);
        return new int[]{leftoc,rightoc};
        
    }
    public int findLeft(int[] arr,int target,int left,int right){
        int ans=-1;
        while(left<=right){
          int  mid=left+(right-left)/2;
            if(arr[mid]==target){
              ans=mid;
              right=mid-1;
            }else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    public int findRight(int[] arr,int target,int left,int right){
        int ans=-1;
         while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;  
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}