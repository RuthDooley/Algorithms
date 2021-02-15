public class Fibonacci {
    static int fibon1 (int n){
        if (n <= 1) return 1;

        int fib = 1;
        int prevFib = 1;
        int temp;

        for (int i = 2; i < n; i++){
            temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    static int fibon2 (int n) {
        if (n <= 1)
            return n;
        return fibon2(n-1) + fibon2(n-2);
    }
}
