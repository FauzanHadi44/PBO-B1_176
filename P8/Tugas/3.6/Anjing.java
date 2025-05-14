public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara Guk-guk.");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan Melata.");
    }

    public void tampilData() {
        System.out.println("Anjing dengan nama: " + nama);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
