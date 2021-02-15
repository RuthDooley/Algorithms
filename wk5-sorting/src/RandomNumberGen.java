import java.util.Random;

public class RandomNumberGen {
    public static int [] randomArray (int n){
        int [] array = new int [n];
        int result;
        for (int i = 0; i < array.length; i ++){
            Random rand = new Random();
            //Only testing from numbers from 0 - 99
            result = rand.nextInt(99);
            array[i] = result;
        }
        return array;
    }
}
