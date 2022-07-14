class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum=nums1.length +nums2.length;
        int i=nums1.length-1;
        int j=nums2.length-1;
        int[] arr= new int[sum];
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                arr[--sum]=nums1[i--];
            }
            else{
                arr[--sum]=nums2[j--];
            }
        }
        while(i>=0){
            arr[--sum]=nums1[i--];
        }
        while(j>=0){
            arr[--sum]=nums2[j--];
        }
        int median=(nums1.length+nums2.length-1)/2;
        if((nums1.length+nums2.length)%2==0){
            return((double)(arr[median]+arr[median+1])/2.0000D);
        }
        return (double)arr[median];
    }
}