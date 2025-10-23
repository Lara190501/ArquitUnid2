public class Main {
    public static void main(String[] args) {
        MyList lista = new MyList();
        lista.sort();

        SortStrategy strat = new ShellSort();
        lista.setSortStrategy(strat);
        lista.sort();

        lista.setSortStrategy(new HeapSort());
        lista.sort();
    }
}
