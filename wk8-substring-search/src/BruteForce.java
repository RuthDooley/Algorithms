public class BruteForce {
    public static int bruteForceSearch (String txt, String pat){
        int n = txt.length();
        int m = pat.length();

        for (int pos = 0; pos < n-m; pos++){
            int j=0;
            while((j < m) && (txt.charAt(pos + j) == pat.charAt(j)))
                j++;

            if(j == m){
                return pos;
            }
        }
        return -1;
    }
}
