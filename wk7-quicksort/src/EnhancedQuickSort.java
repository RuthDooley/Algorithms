public class EnhancedQuickSort {
    static final int CUTOFF = 10;
    public static void quickSort (int array[], int low, int high){
        if (high <= low + CUTOFF) {
            InsertionSort.insertionSort(array, low, high);
            return;
        }

        if (low < high){
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int temp;
        int median = medianOf3(arr, low,low + (high - low)/2, high);
        int pivot = median;
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i +1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static int medianOf3(int array [], int low, int middle, int high){
        int a = array[low];
        int b = array[middle];
        int c = array[high];
        if ((a > b) && (a > c)) return a;
        else if ((b < a) && (b < c)) return b;
        else return c;
    }
}
