class count_digit{
    public static int count(int n){
        return digi(n,0);
    }
public static int digi(int n, int sum){
    if(n==0){
        return sum;
    }
    int rem=n%10;
    if(rem==4){
        return digi(n/10,sum+1);
    }
    return digi(n/10,sum);
}
    public static void main(String[] args) {
        int number = 1020300;
        System.out.println(count(number));
    }

}
