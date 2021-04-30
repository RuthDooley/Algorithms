import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int sizeOfArray = 25000;
        int [] A = RandomNumberGen.randomArray(sizeOfArray);
        System.out.println("Unsorted Array A--> " + Arrays.toString(A));
        int [] B = RandomNumberGen.randomArray(sizeOfArray);
        System.out.println("Unsorted Array B --> " + Arrays.toString(B));
//        int [] C = RandomNumberGen.randomArray(sizeOfArray);
//        System.out.println("Unsorted Array C --> " + Arrays.toString(C));

        long start1 = System.nanoTime();
        int [] a = SelectionSort.selectionSort(A);
        long finish1 = System.nanoTime();
        long timeElapsed1 = finish1 - start1;
        System.out.println("Selection sort elapsed time = " + timeElapsed1);

        long start2 = System.nanoTime();
        int [] b = InsertionSort.insertionSort(B);
        long finish2 = System.nanoTime();
        long timeElapsed2 = finish2 - start2;
        System.out.println("Insertion sort elapsed time = " + timeElapsed2);

//        long start3 = System.nanoTime();
//        int [] c = SillySort.bogoSort(C);
//        long finish3 = System.nanoTime();
//        long timeElapsed3 = finish3 - start3;
//        System.out.println("Bogo sort elapsed time = " + timeElapsed3);

        System.out.println("A Result is -> " + Arrays.toString(a));
        System.out.println("B Result is -> " + Arrays.toString(b));
//        System.out.println("C Result is -> " + Arrays.toString(c));
    }
}
