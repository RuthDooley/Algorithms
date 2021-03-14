import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        int sizeOfArray = 5;
        int [] A = RandomNumberGen.randomArray(sizeOfArray);
        System.out.println("Unsorted Array A--> " + Arrays.toString(A));
        int [] B = RandomNumberGen.randomArray(sizeOfArray);
        System.out.println("Unsorted Array B --> " + Arrays.toString(B));
        B = shuffle(B); //Shuffle B before timer
        System.out.println("Shuffled Array B --> " + Arrays.toString(B));

        long startA = System.nanoTime();
        QuickSort.quickSort(A, 0, A.length-1);
        long finishA = System.nanoTime();
        long timeElapsedA = finishA - startA;
        System.out.println("Quick Sort elapsed time = " + timeElapsedA);

        long startB = System.nanoTime();
        EnhancedQuickSort.quickSort(B, 0, B.length-1);
        long finishB = System.nanoTime();
        long timeElapsedB = finishB - startB;
        System.out.println("Enhanced Quick Sort elapsed time = " + timeElapsedB);

        System.out.println("A Result is -> " + Arrays.toString(A));
        System.out.println("B Result is -> " + Arrays.toString(B));
    }

    public static int [] shuffle (int array []){
        Random rand = new Random();
        int result, temp;
        for (int i = 0; i < array.length; i++){
            result = rand.nextInt(array.length);
            temp = array[i];
            array[i] = array[result];
            array[result] = temp;
        }
        return array;
    }
}
