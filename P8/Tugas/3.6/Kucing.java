public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara Meong.");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerang dengan Melata.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
