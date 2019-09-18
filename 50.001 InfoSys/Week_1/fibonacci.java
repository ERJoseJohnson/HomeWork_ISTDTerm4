import java.*;

public class fibonacci {
    // Recursively finding out the nth value in the fibonacci sequence
    private static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibo(7));
    }

}