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
    import java.util.*;

public class SeriesAssessment {
    public static void main(String[] args) {
        ArrayList<Integer> series = new ArrayList<>();
        int[] diffs = {3, 8, 13, 20, 21, 28, 31, 33, 38, 47, 52, 59, 61, 62, 73, 79, 82, 91, 103};
        int current = 1, i = 0;
        while (series.size() < 100) {
            series.add(current);
            current += diffs[i % diffs.length];
            i++;
        }

        System.out.println("Level 1 Series:");
        for (int num : series) System.out.print(num + " ");
        System.out.println();

        System.out.println("Level 2 Even-Digit Numbers:");
        for (int num : series) {
            if (onlyEvenDigits(num)) System.out.print(num + " ");
        }
        System.out.println();

        int pairCount = 0;
        System.out.println("Level 3 Valid Pairs:");
        for (int k = 0; k < series.size() - 1; k++) {
            int a = series.get(k), b = series.get(k + 1);
            if (isPrime(Math.abs(a - b))) {
                System.out.println("(" + a + ", " + b + ")");
                pairCount++;
            }
        }
        System.out.println("Total Valid Pairs: " + pairCount);
    }

    static boolean onlyEvenDigits(int n) {
        while (n > 0) {
            if ((n % 10) % 2 != 0) return false;
            n /= 10;
        }
        return true;
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
     
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
