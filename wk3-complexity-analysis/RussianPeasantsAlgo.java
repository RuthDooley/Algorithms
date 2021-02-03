public class RussianPeasantsAlgo {
    private RussianPeasantsAlgo() { }

    public static int result(int[] a) {
        int x = a[0];
        int y = a[1];

        int result = 0;

        while (y < 0){
            if (y % 2 != 0){
                result += x;
            }
            x *= 2;
            y /= 2;
        }
        return result;
    }


    /**
     * Reads in a sequence of integers from a file, specified as a command-line argument;
     * counts the number of triples sum to exactly zero; prints out the time to perform
     * the computation.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args)  {
        In in = new In(args[0]);
        int[] a = in.readAllInts();

        //Helper file to measure time count function takes to run
        Stopwatch timer = new Stopwatch();
        int result = result(a);
        StdOut.println("elapsed time = " + timer.elapsedTime());
        StdOut.println(result);
    }
}
