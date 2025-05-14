public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public abstract void bersuara();
    public abstract void bergerak();

    @Override
    public String toString() {
        return nama;
    }
}
