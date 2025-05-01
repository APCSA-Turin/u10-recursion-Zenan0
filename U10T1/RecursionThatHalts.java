package U10T1;

public class RecursionThatHalts {
    public static void main(String [] args) {
        System.out.println("main method called");
        recursiveMethod(4);
        System.out.println("main method ended");
    }

    public static void recursiveMethod(int n) {
        System.out.println("recursive called, n = " + n);
        if (n < 10) {
            recursiveMethod(n + 1);
        }
        System.out.println("recursive ended, n = " + n);
    }
}
