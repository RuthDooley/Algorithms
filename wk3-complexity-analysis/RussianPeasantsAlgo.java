public class RussianPeasantsAlgo {
    private RussianPeasantsAlgo() { }

    public static int result(int[] a) {
        int x = a[0];
        int y = a[1];

        int result = 0;

        while (y > 0){
            if (y % 2 != 0) {
                result += x;
            }
            x *= 2;
            y /= 2;
        }
        return result;
    }

    public static void main(String[] args)  {
        In in = new In(args[0]);
        int[] a = in.readAllInts();

        long start = System.nanoTime();
        int result = result(a);
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        StdOut.println("elapsed time in nano seconds = " + timeElapsed);
        StdOut.println("Result is -> " + result);
    }
}
