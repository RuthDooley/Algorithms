public class main {
    public static void main(String[] args) {
        String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String pat1 = "LMNOP";

        //Brute Force Timing
        long startA = System.nanoTime();
        int position = BruteForce.bruteForceSearch(txt1, pat1);
        if (position == -1){
            System.out.println("Pattern is not in text");
        } else {
            System.out.println("Pattern is at " + (position + 1) + " and ends at " + (position + 1 + pat1.length()));
        }
        long finishA = System.nanoTime();
        long timeElapsedA = finishA - startA;

        //KMP Timing
        long startB = System.nanoTime();
        KnuthMorrisPratt.KMPsearch(txt1, pat1);
        long finishB = System.nanoTime();
        long timeElapsedB = finishB - startB;

        System.out.println("Brute Force elapsed time = " + timeElapsedA);
        System.out.println("KMP elapsed time = " + timeElapsedB);

    }
}
