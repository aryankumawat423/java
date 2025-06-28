
public class min_recursion
{
    public static int maxi(int[] arr,int n){
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n-1],maxi(arr,n-1));
    }
	public static void main(String[] args) {
	    int[] arr = {21,143,23,52,51};
	    
		System.out.println(maxi(arr,5));
	}
}
