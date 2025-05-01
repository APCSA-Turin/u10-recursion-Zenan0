package U10T1L4;

public class Main {
    public static void main(String[] args) {
        int n = 40;
        long startTime = System.nanoTime();
        int fibRec = fibonacci(n);
        long endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;


        startTime = System.nanoTime();
        int fibIter = fibIterative(n);
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;
        System.out.println("Fibonacci(" + n + ")");

        System.out.println("Recursive: " + fibRec + " | Time: " + recursiveTime / 1e6 + " ms");
        System.out.println("Iterative: " + fibIter + " | Time: " + iterativeTime / 1e6 + " ms");
    }

    private static int fibonacci(int x) {
        if (x == 1) {
            return 0;
        }
        if (x == 2) {
            return 1;
        }
        // double recursive method call
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    private static int fibIterative(int n) {
        if (n < 2) {
            return n;
        }
        int firstNum = 0;
        int secondNum = 1;
        for (int i = 1; i < n-1; i++) {
            int total = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = total;
        }
        return secondNum;
    }
}
