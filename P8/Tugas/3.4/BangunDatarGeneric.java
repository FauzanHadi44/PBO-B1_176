public class BangunDatarGeneric <T extends BangunDatar> {
    private T bangunDatar;

    public BangunDatarGeneric(T bangunDatar) {
        this.bangunDatar = bangunDatar;
    }

    public void set(T bangunDatar){
        this.bangunDatar = bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }

    public double hitungLuas(){
        return bangunDatar.hitungLuas();
    }

    public void printInfo() {
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}
