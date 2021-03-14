public class InsertionSort {
    public static void insertionSort(int a[], int low, int high) {
        for (int i = low; i < high; i++) {
            int index = a[i + 1];
            int j = i + 1;
            while (j > low && a[j - 1] > index) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = index;
        }
    }
}