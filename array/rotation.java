// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
   static int n;
  static  int k;
    public static void rota(int arr[]){
    swap(arr,0,n-1);
     
    swap(arr,0,k-1);
     
    swap(arr,k,n-1);
     
}
 public static void swap(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
     }
    
     
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);
        int start=0;
        System.out.println("enter roatuoi");
        k=sc.nextInt();
        System.out.println("enter length");
        n =sc.nextInt();
        int end=n-1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rota(arr);
        
        for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
        }

        
    }
}
