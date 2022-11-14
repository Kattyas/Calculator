public class Main {
    public static void main(String[] args) {


        Calculator Calc = new Calculator();

        int nrZero      = 0;
        int nrUnu       = 1;
        int nrDoi       = 2;
        int nrUnspe     = 11;
        int a           = 20;
        int b           = 15;
        int x           = 4;
        int nrOsuta     = 100;
        int nrOsutaZece = 110;

        int adunare = Calc.operAdunare(a,b);
        System.out.println(adunare);
        int scadere = Calc.operScadere(a,b);
        System.out.println(scadere);
        int inmultire = Calc.operInmultire(a,b);
        System.out.println(inmultire);
        float impartire = Calc.operImpartire(a,b);
        System.out.println(impartire);






    }

















}