public class Burung extends Anabul{
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara Cuit.");
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan Terbang.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}