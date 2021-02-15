
public class SillySort {
    public static int[] bogoSort (int a[]) {
        int j, temp;
        while (!correctOrder(a)) {
            for (int i = 1; i <= a.length; i++) {
                j = (int) (Math.random() * i);
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        return a;
    }

    public static boolean correctOrder (int[] a){
        for (int i=1; i<a.length; i++)
            if (a[i] < a[i-1])
                return false;
        return true;
    }
}
