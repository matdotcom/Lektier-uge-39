public class Main {
    public static void main(String[] args) {
        Aktie aktie = new Aktie("Apple", " Apple ");

        // her indtaster vi hvad prisen var for aktien 1 dag siden og idag.
        aktie.tidlPris = 148.45;
        aktie.nuPris = 151.23;
        System.out.println(" Ny Aktie   " + aktie.Symbol + " Navnet på firmaet " + aktie.Navn);
        System.out.println("Igår var prisen" + aktie.tidlPris);
        System.out.println(" Idag er prisen" + aktie.nuPris);
    }
}
