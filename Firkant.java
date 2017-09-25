public class Firkant {

    // Standard constructor for at definere firkant.
    double længde;
    double højde;

    Firkant(double nyHøjde, double nyLængde) {

        // constructor som gør at man kan bruge nye data for længde og bredde
        højde = nyHøjde;
        længde = nyLængde;

    }
      // Areal udregning og defination af getAreal som double
    double getAreal() {

        return længde * højde;

    }
      // Omkreds udregning og defination af getOmkreds som double
    double getOmkreds() {

        return (2 * (længde + højde));
    }
}
