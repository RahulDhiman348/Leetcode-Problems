class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
       int start=0;
        int end=height.length -1;
        while(start<end){
            int width=end- start;
            maxarea=Math.max(maxarea, Math.min(height[start],height[end])*width);
            if(height[start]<=height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxarea;
    }
}
        