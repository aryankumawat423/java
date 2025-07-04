class binary_search{
    public static int search(int[] arr,int target){
        int start=arr.length-1;
        int end=0;
        while(start>=end){
            int mid=start+(end-start)/2;
        
        if(arr[mid]<target){
            start=mid-1;
        }
        else if(arr[mid]>target){
            end=mid+1;
        }
        else{
            return mid;
        }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr={6574,454,97,34,23,8,1};
        System.out.println(search(arr,8));

    }
}