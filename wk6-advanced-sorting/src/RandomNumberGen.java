import java.util.Random;
public class RandomNumberGen {
    public static int [] randomArray (int n){
        int [] array = new int [n];
        int result;
        for (int i = 0; i < array.length; i ++){
            Random rand = new Random();
            //Only testing from numbers from 0 - 1000
            result = rand.nextInt(1000);
            array[i] = result;
        }
        return array;
    }
}