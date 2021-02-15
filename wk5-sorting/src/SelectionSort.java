public class SelectionSort {
    public static int[] selectionSort (int [] a){
        int smallestNum;
        int smallestNumPos;
        int n = 1;
        for (int i = 0; i < a.length - 1; i ++){
            smallestNum = 0;
            smallestNumPos = 0;
            for (int j = 1; j < a.length; j++){
                if (j == n){
                    smallestNum = a[j];
                    smallestNumPos = j;

                    continue;
                }
                if (a[j] < smallestNum){
                    smallestNum = a[j];
                    smallestNumPos = j;
                }
            }
            n++;
            a[smallestNumPos] = a[i];
            a[i] = smallestNum;
        }
        return a;
    }
}
