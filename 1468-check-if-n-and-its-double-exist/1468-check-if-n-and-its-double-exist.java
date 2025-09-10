class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int start=arr.length-1;
        while(0<start){
            if(arr[start]<0){
                int x=0;
                while(x<=start){
                if(binarysearch(arr,start-1,arr[x])){
                    return true;
                }
                x++;
                }
                start--;
                
            }
            else{
                if(binarysearch(arr,start-1,arr[start]))
                return true;
            }
            start--;
        }
        return false;
    }
    public boolean binarysearch(int[] arr,int end,int target){
        int start=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]*2==target){
                return true;
            }
            else if(arr[mid]*2>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
         return false;
    }
}