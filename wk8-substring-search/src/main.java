public class main {
    public static int PATTERN_LENGTH = 5;
    public static int TEXT_LENGTH = 10;
    public static void main(String[] args) {
        String txt1 = RandomTextGen.text(TEXT_LENGTH);
        String pat1 = RandomTextGen.pattern(TEXT_LENGTH, PATTERN_LENGTH, txt1);
        System.out.println("Text is " + txt1 + " and pattern is " + pat1 + "\n");

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
