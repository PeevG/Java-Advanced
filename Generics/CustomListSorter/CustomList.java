package GenericsP07AndP08;

import java.util.ArrayList;
import java.util.List;

public class CustomList<E extends Comparable<E>> {
    private List<E> data;

    public CustomList() {
        this.data = new ArrayList<>();
    }
    public int size() {
        return this.data.size();
    }

    public void add(E element) {
        this.data.add(element);
    }

    public E remove(int index) {
        return this.data.remove(index);
    }
    public boolean contains(E element) {
        return this.data.contains(element);
    }
    public void swap(int index1, int index2) {
        E firstEl = this.data.get(index1);
        this.data.set(index1, this.data.get(index2));
        this.data.set(index2, firstEl);
    }
    public long countGreaterThan(E toCompare){
        return this.data.stream().filter(e -> e.compareTo(toCompare) > 0).count();
    }
    public E getMax() {
        E maxEl = this.data.get(0);
        for (E datum : data) {
            if(datum.compareTo(maxEl) > 0) {
                maxEl = datum;
            }
        }
        return maxEl;
    }
    public E getMin() {
        E minEl = this.data.get(0);
        for (E datum : data) {
            if(datum.compareTo(minEl) < 0) {
                minEl = datum;
            }
        }
        return minEl;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (E value : this.data) {
            sb.append(value.toString())
                    .append(System.lineSeparator());
        }
        return sb.toString().trim();
    }

    public E get(int i) {
        return this.data.get(i);
    }
}
