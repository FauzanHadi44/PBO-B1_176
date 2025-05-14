import java.util.Random;

public class MAnabul {    
    public static void main(String[] args) {
        KoleksiAnabul<Anabul> koleksiAnabul = new KoleksiAnabul<>();
        Random rnd = new Random();

        for (int i = 1; i < 11; i++) {
            int jenis = rnd.nextInt(3); 
            switch (jenis) {
                case 0:
                    koleksiAnabul.add(new Kucing("Kucing" + i));
                    break;
                case 1:
                    koleksiAnabul.add(new Anjing("Anjing" + i));
                    break;
                default:
                    koleksiAnabul.add(new Burung("Burung" + i));
                    break;
            }
        }

        System.out.println("=== Koleksi Anabul ===");
        koleksiAnabul.showAll(); 

        System.out.println("\n=== Anabul ===");
        for (int i = 0; i < koleksiAnabul.getSize(); i++) {
            Anabul a = koleksiAnabul.getIsi(i);
            System.out.printf("%s: ", a.getNama());
            a.bersuara();
            a.bergerak();
        }
    }
}
