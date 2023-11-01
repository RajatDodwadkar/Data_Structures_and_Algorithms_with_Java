import java.awt.*;
import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }

//    time complexity : O(d)  d - no of digits in the number.
    public static Boolean isPalindrome(int n){
        int rev=0;
        int temp= n;
        while(temp!=0){
            int ld = temp%10;
            rev = rev*10+ld;
            temp=temp/10;
            }
            return (rev==n);
        }
    }
