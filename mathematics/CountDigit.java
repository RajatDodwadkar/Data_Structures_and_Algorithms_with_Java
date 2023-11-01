import java.util.Scanner;
public class CountDigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(count1(n));
//        System.out.println(count2(n));
//        System.out.println(count3(n));
    }

//    approach 1: iterative solution
    public static int count1(long n){
        int c = 0;
        while(n>0) {
            n=n/10;
            c++;
        }
        return c;
    }

    //    approach 2 : recursive solution
    public static int count2(long n){
        if (n==0){
            return 0;
        }
        return 1+count2(n/10);
    }

    //    approach 3 : logarithmic solution
    public static int count3(long n){
        return (int) Math.floor(Math.log10(n)+1);
    }
}
