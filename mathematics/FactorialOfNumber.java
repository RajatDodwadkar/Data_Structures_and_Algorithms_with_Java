import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial1(n));
//        System.out.println(factorial2(n));
    }

//    approach 1 : iterative method. time complexity : O(n)
    public static long factorial1(int n){
        if(n == 1 || n ==0){
            return 1;
        }
        long fact = 1 ;
        for(int i =1;i<=n;i++){
            fact = fact *i;
        }
        return fact;
    }

//    approach 2 : recursive method. time complexity :O(n)
     public static long factorial2(int n){
        if(n == 1 || n ==0){
            return 1;
        }
        return n*factorial2(n-1);
     }
}
