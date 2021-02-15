public class main {
    public static void main(String[] args) {
        int n = 50;

        long start1 = System.nanoTime();
        long result1 = Fibonacci.fibon1(n);
        long finish1 = System.nanoTime();
        long timeElapsed1 = finish1 - start1;
        StdOut.println("Fibonacci algorithms option A  = " + timeElapsed1);
        StdOut.println("Result is -> " + result1);

        long start2 = System.nanoTime();
        long result2 = Fibonacci.fibon2(n);
        long finish2 = System.nanoTime();
        long timeElapsed2 = finish2 - start2;
        StdOut.println("Fibonacci algorithms option B  = " + timeElapsed2);
        StdOut.println("Result is -> " + result2);

        int disk = 6;
        int startPos = 1;
        int auxPos = 2;
        int destPos = 3;
        long start3 = System.nanoTime();
        int noOfMoves = Hanoi.towersOfHanoi(disk, startPos, destPos, auxPos);
        long finish3 = System.nanoTime();
        long timeElapsed3 = finish3 - start3;
        StdOut.println("Hanoi Algorithm Time (NanoSeconds) = " + timeElapsed3 + "\nNo of moves = " + noOfMoves);
    }
}

//Ints used see docs
