
public class Aktie {

    // Her opretter vi en string der hedder symbol
   public String Symbol;
    // Her opretter vi en string der hedder navn
   public String Navn;

    double nuPris;
    double tidlPris;

    // Her laver vi en constructor som laver vores nye aktie
    Aktie(String Nysymbol, String Nynavn) {
        Symbol = Nysymbol;
        Navn = Nynavn
    }
    double hentPrisforeskel() {
        return ((nuPris-tidlPris)/tidlPris) * 100;
    }


}
