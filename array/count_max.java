import java.util.Scanner;
public class count_max{
    static int n;
    public static void count_max(int arr[]){
        int max=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
             for(int i=0;i<n;i++){
                if(arr[i]==max){
                    count++;
                }
             }
        
        int answer=n-count;
        System.out.println(answer);
    }

        
    public static void main(String[] args) {
        count_max obj = new count_max();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        count_max(arr);        
    }
}
