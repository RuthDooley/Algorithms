public class main {
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

    public static void main(String[] args) {
        int n = 9;
        System.out.println(fibon1(n));
    }
}
