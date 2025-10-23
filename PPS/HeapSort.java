class HeapSort extends SorStrategy {

    @Override
    public void sort(MyList list) {
        System.out.println("Ordenação HeapSort");
        List<Integer> data = list.getData();
        int n = data.size();

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(data, n, i);

        for (int i = n - 1; i > 0; i--) {
            swap(data, 0, i);
            heapify(data, i, 0);
        }
    }

    private void heapify(List<Integer> data, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && data.get(left) > data.get(largest))
            largest = left;

        if (right < n && data.get(right) > data.get(largest))
            largest = right;

        if (largest != i) {
            swap(data, i, largest);
            heapify(data, n, largest);
        }
    }

    private void swap(List<Integer> data, int i, int j) {
        int temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }
}