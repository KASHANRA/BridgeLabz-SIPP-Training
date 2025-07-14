package level_1;
public class RecursiveVSIterativeFibonacciComputation {
    public static void main(String[] args) {
        int[] testValues = {10, 30, 50};  
        for (int n : testValues) {
            System.out.println("Fibonacci for N = " + n);
            long startTime = System.nanoTime();
            System.out.println("Recursive result: " + fibonacciRecursive(n));
            long endTime = System.nanoTime();
            System.out.println("Recursive time: " + (endTime - startTime) / 1000000.0 + " ms");
            startTime = System.nanoTime();
            System.out.println("Iterative result: " + fibonacciIterative(n));
            endTime = System.nanoTime();
            System.out.println("Iterative time: " + (endTime - startTime) / 1000000.0 + " ms");        
            System.out.println();
        }
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
