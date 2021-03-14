import java.util.Arrays;

public class QuickSort {
    public static void quickSort (int array[], int low, int high){
        if (low < high){
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int temp;
        int pivot = arr[high];
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
}
