package U10T1;

public class FactorialRunner {
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
    }

    public static int factorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static int recursiveFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * recursiveFactorial(n - 1);
        }
    }
}
