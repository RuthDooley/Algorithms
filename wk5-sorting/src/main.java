import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int sizeOfArray = 25000;
        int [] a = RandomNumberGen.randomArray(sizeOfArray);
        System.out.println("Unsorted Array --> " + Arrays.toString(a));

        long start1 = System.nanoTime();
        int [] b = SelectionSort.selectionSort(a);
        long finish1 = System.nanoTime();
        long timeElapsed1 = finish1 - start1;
        System.out.println("Selection sort elapsed time = " + timeElapsed1);


        long start2 = System.nanoTime();
        int [] c = InsertionSort.insertionSort(a);
        long finish2 = System.nanoTime();
        long timeElapsed2 = finish2 - start2;
        System.out.println("Insertion sort elapsed time = " + timeElapsed2);


        long start3 = System.nanoTime();
        int [] d = SillySort.bogoSort(a);
        long finish3 = System.nanoTime();
        long timeElapsed3 = finish3 - start3;
        System.out.println("Bogo sort elapsed time = " + timeElapsed3);

        System.out.println("Result is -> " + Arrays.toString(b));
        System.out.println("Result is -> " + Arrays.toString(c));
        System.out.println("Result is -> " + Arrays.toString(d));
    }
}
