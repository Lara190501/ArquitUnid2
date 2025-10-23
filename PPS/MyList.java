import java.util.Arrays;

public class MyList {
    private SortStrategy strategy;
    private int[] data;

    public MyList() {
        this.data = new int[]{42, 7, 19, 3, 88, 5, 1, 13, 21, 5};
        this.strategy = new QuickSortStrategy();
    }

    public MyList(int[] values) {
        this.data = Arrays.copyOf(values, values.length);
        this.strategy = new QuickSortStrategy();
    }

    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public int size() {
        return data.length;
    }

    public int get(int i) {
        return data[i];
    }

    public void set(int i, int v) {
        data[i] = v;
    }

    public int[] data() {
        return data;
    }

    public void sort() {
        strategy.sort(this);
    }

    public void print() {
        System.out.println(Arrays.toString(data));
    }
}
