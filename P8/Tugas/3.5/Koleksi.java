import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm;
    private ArrayList<T> wadah;

    public Koleksi() {
        this.nbelm = 0;
        this.wadah = new ArrayList<>();
    }

    public T getIsi(int index) {
        return wadah.get(index);
    }

    public void setIsi(int index, T elemen) {
        wadah.set(index, elemen);
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        this.nbelm = size;
    }

    public void add(T elemen) {
        wadah.add(elemen);
        nbelm++;
    }

    public void delete(int index) {
        wadah.remove(index);
        nbelm--;
    }

    public void showAll() {
        for (T elemen : wadah) {
            System.out.println(elemen);
        }
    }
}
