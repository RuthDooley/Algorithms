import java.util.Random;
public class RandomTextGen {
    public static String text (int textLength){
        Random r = new Random();
        StringBuilder txt = new StringBuilder();
        char c;
        for (int i = 0; i < textLength; i ++){
            c = (char)(r.nextInt(26) + 'a');;
            txt.append(c);
        }
        return txt.toString();
    }

    public static String pattern (int textLength, int patternLength, String txt){
        StringBuilder pat = new StringBuilder();
        char c;
        Random r = new Random();
        //0 - (txt length - patt length)
        int num = (r.nextInt(textLength - patternLength));

        //Find the character at num and inc pattern length and return as pattern
        for (int i = num; i < num + patternLength; i++){
            c = txt.charAt(i);
            pat.append(c);
        }
        return pat.toString();
    }
}
