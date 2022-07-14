class Solution {
    public void sortColors(int[] arr) {
        int low=0;
        int mid=0;
        int hi=arr.length-1;
        int temp;
        while(mid<=hi){
        switch(arr[mid]){
            case 0:{
                temp = arr[mid];
                arr[mid]= arr[low];
                arr[low]=temp;
                mid++;
                low++;
                break;
            }
            case 1:{
                mid++;
                 break;
            }
            case 2:{
                temp= arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=temp;
                hi--;
               
                 break;
            }
        }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}