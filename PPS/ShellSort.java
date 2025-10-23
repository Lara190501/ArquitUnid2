public class ShellSort extends SortStrategy {
    public void sort(MyList list) {
        int[] a = list.data();
        int n = a.length;
        int gap = 1;
        while (gap < n / 3) gap = 3 * gap + 1;
        while (gap >= 1) {
            for (int i = gap; i < n; i++) {
                int temp = a[i];
                int j = i;
                while (j >= gap && a[j - gap] > temp) {
                    a[j] = a[j - gap];
                    j -= gap;
                }
                a[j] = temp;
            }
            gap /= 3;
        }
        System.out.println("Ordenação ShellSort");
        list.print();
    }
}
