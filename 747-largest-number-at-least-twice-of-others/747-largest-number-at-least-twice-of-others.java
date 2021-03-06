class Solution {
    public int dominantIndex(int[] nums) {
        int count=0;
        int index=0;
        int max= nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i != index && max >= 2*nums[i]){
                count++;
            }
        }
        if(count==nums.length-1){
            return index;
        }
        else{
            return -1;
        }
    }
}