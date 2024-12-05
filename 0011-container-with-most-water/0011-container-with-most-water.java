class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
      int  maxArea=0;
        while(left<right){
            int width=right-left;
            int currentHeight=Math.min(height[left],height[right]);
            int area=width*currentHeight;
            maxArea=Math.max(area,maxArea);
            if(height[left]<height[right])left++;
            else right--;
        }
        return maxArea;
    }
}