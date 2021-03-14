import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int sizeOfArray = 100;
        int [] A = RandomNumberGen.randomArray(sizeOfArray);
        System.out.println("Unsorted Array A--> " + Arrays.toString(A));
        int [] B = RandomNumberGen.randomArray(sizeOfArray);
        System.out.println("Unsorted Array B --> " + Arrays.toString(B));
        int [] C = RandomNumberGen.randomArray(sizeOfArray);
        System.out.println("Unsorted Array C --> " + Arrays.toString(C));
        int [] auxA = new int [A.length];
        int [] auxB = new int [B.length];

        long startA = System.nanoTime();
        MergeSort.sorting(auxA, A, 0, A.length-1);
        long finishA = System.nanoTime();
        long timeElapsedA = finishA - startA;
        System.out.println("Merge Sort elapsed time = " + timeElapsedA);

        long startB = System.nanoTime();
        EnhancedMergeSort.sorting(auxB, B, 0, B.length-1);
        long finishB = System.nanoTime();
        long timeElapsedB = finishB - startB;
        System.out.println("Enhanced Merge Sort elapsed time = " + timeElapsedB);

        long startC = System.nanoTime();
        InsertionSort.insertionSort(C, 0, C.length-1);
        long finishC = System.nanoTime();
        long timeElapsedC = finishC - startC;
        System.out.println("Insertion Sort elapsed time = " + timeElapsedC);
        
        System.out.println("A Result is -> " + Arrays.toString(auxA));
        System.out.println("B Result is -> " + Arrays.toString(auxB));
        System.out.println("C Result is -> " + Arrays.toString(C));
    }
}
