class infinite_binarys{
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7,8,13,56,768,8679,3563,345353};
        System.out.println(infi(arr,13)); 
    }
    public static int infi(int[] arr,int x){
        int start=0;
        int end=1;
        while(arr[end]<x){
            int newstart=end+1;
            end=end+(end-start+1)*2;    
            start=newstart;
        }
        return search(arr,x,start,end);
    }
    public static int search(int[] arr,int target,int start,int end){
        // int start=arr.length-1;
        // int end=0;
        while(start<=end){
            int mid=start+(end-start)/2;
        
        if(arr[mid]<target){
            start=mid+1;
        }
        else if(arr[mid]>target){
            end=mid-1;
        }
        else{
            return mid;
        }
        }
        return -1;
    }

   
}
