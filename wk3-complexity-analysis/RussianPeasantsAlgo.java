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
    
    public static long result1(long[] a) {
        return a[0] * a[1];
    }


    public static void main(String[] args)  {
        In in = new In(args[0]);
        long[] a = in.readAllLongs();

        long start1 = System.nanoTime();
        long result1 = result(a);
        long finish1 = System.nanoTime();
        long timeElapsed1 = finish1 - start1;
        StdOut.println("Russian Peasant Algo: Elapsed time in nano seconds = " + timeElapsed1);
        StdOut.println("Result is -> " + result1);

        long start2 = System.nanoTime();
        long result2 = result1(a);
        long finish2 = System.nanoTime();
        long timeElapsed2 = finish2 - start2;
        StdOut.println("Multiply: Elapsed time in nano seconds = " + timeElapsed2);
        StdOut.println("Result is -> " + result2);
    }
}
