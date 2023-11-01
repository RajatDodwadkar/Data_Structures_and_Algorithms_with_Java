public class SumOfNnaturalNumbers {
    public static void main(String args[]){
        int n = 6;
        System.out.println(sum1(n));
//        System.out.println(sum2(n));
    }

    //        approach 1
    public static int sum1(int n){
        int sum =0;
        for(int i =0; i<=n;i++){
            sum = sum +i;
        }
        return sum;
    }

    //    approach 2
    public static int sum2(int n){
        return (n*(n+1))/2;
    }

}
