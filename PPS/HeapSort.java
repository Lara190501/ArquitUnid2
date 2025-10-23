public class HeapSort extends SortStrategy {
    public void sort(MyList list) {
        int[] a = list.data();
        int n = a.length;
        for (int i = n / 2 - 1; i >= 0; i--) siftDown(a, n, i);
        for (int end = n - 1; end > 0; end--) {
            int t = a[0]; a[0] = a[end]; a[end] = t;
            siftDown(a, end, 0);
        }
        System.out.println("Ordenação HeapSort");
        list.print();
    }

    private void siftDown(int[] a, int size, int i) {
        while (true) {
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            int m = i;
            if (l < size && a[l] > a[m]) m = l;
            if (r < size && a[r] > a[m]) m = r;
            if (m == i) break;
            int t = a[i]; a[i] = a[m]; a[m] = t;
            i = m;
        }
    }
}
