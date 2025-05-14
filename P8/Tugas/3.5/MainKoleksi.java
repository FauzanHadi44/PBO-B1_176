public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>();

        for (char c = 'A'; c <= 'J'; c++) {
            koleksiKarakter.add(c);
        }

        koleksiKarakter.showAll();
    }
}