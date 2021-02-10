public class RussianPeasantsAlgo {
    private RussianPeasantsAlgo() { }

    public static long result(long[] a) {
        long x = a[0];
        long y = a[1];

        long result = 0;

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
        long[] a = in.readAllLongs();

        long start = System.nanoTime();
        long result = result(a);
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        StdOut.println("elapsed time in nano seconds = " + timeElapsed);
        StdOut.println("Result is -> " + result);
    }
}
