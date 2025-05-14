import java.util.ArrayList;
import java.util.List;

public class KoleksiAnabul<T> {
    private List<T> koleksi;

    public KoleksiAnabul() {
        koleksi = new ArrayList<>();
    }

    public void add(T item) {
        koleksi.add(item);
    }

    public T getIsi(int index) {
        return koleksi.get(index);
    }

    public int getSize() {
        return koleksi.size();
    }

    public void showAll() {
        for (T item : koleksi) {
            System.out.println(item);
        }
    }
}
