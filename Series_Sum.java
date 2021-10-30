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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.printf("Sum of the series upto " + n + "th term = %.2f",findSum(n));
    }
}