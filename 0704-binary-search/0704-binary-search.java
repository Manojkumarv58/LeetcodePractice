class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        return binarySearch(nums,left,right,target);
    }
    public static int binarySearch(int arr[],int left,int right,int target){
        if(left>right)return -1;
        int mid=left+(right-left)/2;
        if(arr[mid]==target)return mid;
        if(arr[mid]<target)return binarySearch(arr,mid+1,right,target);
        else return binarySearch(arr,left,mid-1,target);
    }
}