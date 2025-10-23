public class QuickSortStrategy extends SortStrategy {
    public void sort(MyList list) {
        int[] a = list.data();
        quicksort(a, 0, a.length - 1);
        System.out.println("Ordenação Quicksort");
        list.print();
    }

    private void quicksort(int[] a, int lo, int hi) {
        int i = lo, j = hi;
        int pivot = a[lo + (hi - lo) / 2];
        while (i <= j) {
            while (a[i] < pivot) i++;
            while (a[j] > pivot) j--;
            if (i <= j) {
                int t = a[i]; a[i] = a[j]; a[j] = t;
                i++; j--;
            }
        }
        if (lo < j) quicksort(a, lo, j);
        if (i < hi) quicksort(a, i, hi);
    }
}
