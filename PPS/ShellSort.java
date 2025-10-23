class ShellSort extends SorStrategy {

    @Override
    public void sort(MyList list) {
        System.out.println("Ordenação ShellSort");
        List<Integer> data = list.getData();
        int n = data.size();

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = data.get(i);
                int j;
                for (j = i; j >= gap && data.get(j - gap) > temp; j -= gap) {
                    data.set(j, data.get(j - gap));
                }
                data.set(j, temp);
            }
        }
    }
}
