import java.util.Scanner;

public class TrailingZerosInFactorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(CountTrailZero1(n));
        System.out.println(CountTrailZero2(n));
    }

//    approach 1 : naive method
    public static int CountTrailZero1(int n){
        long fact = 1 ;
        for(int i =2;i<=n;i++){
            fact = fact *i;
        }
        long temp = 0;
        int res = -1;
        while(temp ==0){
            temp = fact%10;
            fact = fact /10;
            res++;
        }
        return res;
    }

//    approach 2: efficient method
    public static int CountTrailZero2(int n){
        int res = 0 ;
        for(int i =5;i<=n;i=i*5){
            res = res + n/i;
        }
        return res;
    }
}
