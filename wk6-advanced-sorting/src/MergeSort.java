public class MergeSort {
    private static void merge(int [] aux, int [] a, int lo, int mid, int hi) {
        if (hi + 1 - lo >= 0) System.arraycopy(a, lo, aux, lo, hi + 1 - lo);

        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (aux[j] < aux[i]) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    public static void sorting (int aux [], int a[], int l, int r){
        if (l < r) {
            int m =l+ (r-l)/2;
            sorting(aux, a, l, m);
            sorting(aux, a, m + 1, r);
            merge(aux, a, l, m, r);
        }
    }
}
