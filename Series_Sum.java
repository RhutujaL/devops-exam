import java.util.Scanner;

class Series_Sum {
    static double findSum(int n) {
        double sum = 0;

        for (double i = 1; i <= n; i++) {
            sum = sum + 1 / i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n ;
        n=Integer.parseInt(args[0]);

        System.out.printf("Sum of the series upto " + n + "th term = %.2f",findSum(n));
    }
}