public class BangunDatarGenericTest {
    public static void main(String[] args){
        BangunDatarGeneric<Persegi> p = new BangunDatarGeneric<Persegi>(new Persegi(4));
        BangunDatarGeneric<PersegiPanjang> pp = new BangunDatarGeneric<PersegiPanjang>(new PersegiPanjang(5, 3));
        BangunDatarGeneric<Segitiga> s = new BangunDatarGeneric<Segitiga>(new Segitiga(4, 5, 3, 4, 5));
        
        System.out.println("===== Persegi =====");
        p.printInfo();
        System.out.println("===== Persegi Panjang=====");
        pp.printInfo();
        System.out.println("===== Segitiga =====");
        s.printInfo();
    }
}
