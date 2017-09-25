public class main {
    public static void main(String[] args) {

        Firkant firkant1 = new Firkant(4, 40);
        Firkant firkant2 = new Firkant(3.5,35.9);

        System.out.println(" Firkant 1");
        System.out.println(" __________ ");
        System.out.println("Arealet er " + firkant1.getAreal());
        System.out.println("Omkredsen er " + firkant1.getOmkreds());
        System.out.println(" _________________________________________");
        System.out.println(" ");
        System.out.println(" Firkant 2");
        System.out.println(" __________ ");
        System.out.println("Arealet er " + firkant2.getAreal());
        System.out.println("Omkredsen er " + firkant2.getOmkreds());
    }
}


