public class KnuthMorrisPratt {
    public static void KMPsearch (String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        int[] lps = new int[m];
        int j = 0;

        computeLPSArray(pat, m, lps);

        int i = 0;

        while (i < n) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                System.out.println("Pattern is at " + (i - j + 1) + " and ends at " + (i - j + 1 + pat.length()));
                j = lps[j - 1];
            } else if (i < n && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
    }

    public static void computeLPSArray (String pat, int m, int [] lps){
        int len = 0, i = 1;
        lps[0] = 0;

        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
}
