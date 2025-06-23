    class selection_sort{
        public void ss(int[] arr){
            for(int i=0;i<arr.length-1;i++){
                int min=i;
                for(int j=i;j<arr.length;j++){
                    if(arr[min]>arr[j]){
                        min=j;
                    }          
                }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            }
        }
        public static void main(String[] args) {
            int[] arr={12,57,324,134,7};
            selection_sort obj=new selection_sort();
            obj.ss(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

        }
    }