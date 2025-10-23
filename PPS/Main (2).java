class Main {
    public static void main(String[] args) {
        MyList lista = new MyList();
        lista.add(5);
        lista.add(2);
        lista.add(9);
        lista.add(1);
        lista.add(6);

        System.out.println("Lista original:");
        lista.print();

        // QuickSort
        lista.sort();
        System.out.println("Após QuickSort:");
        lista.print();

        // ShellSort
        lista.setSortStrategy(new ShellSort());
        lista.sort();
        System.out.println("Após ShellSort:");
        lista.print();

        // HeapSort
        lista.setSortStrategy(new HeapSort());
        lista.sort();
        System.out.println("Após HeapSort:");
        lista.print();
    }
}