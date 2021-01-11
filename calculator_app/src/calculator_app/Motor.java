package calculator_app;

public class Motor {
    /*
    Az akutális értéket szeretnénk, ha nem tudnák manipulálni, ezért privát.
    Hogy a érték módosítása során se férjenek hozzá kívülről, privát metódusokkal kell módosítani az értéket.
    A privát metódusokban maradékos osztással (%) el tudjuk dönteni, hogy integer vagy double típusban kell visszaadni az értéket.
    Végül egy privát switch-case alapján társítjuk a enum elemeit a megfelelő, privát metódusokkal/műveletekkel.
    Azért String típusban kérjük be a számot, mert majd a View-nél a gombok eredménye String típusúak.
    Végül pedig egy publikus metódus meghívja a switch-case-es privát metódus, mert az meghívja a privát műveleti metódust,
    de a közvetett hívás miatt nem lehet befolyásolni az aktual_erteket. 
    A publikus metódusokkat kell tesztelni.
    */
    
     private double aktual_ertek;
     
     private void p_Osszead (double szam){
       aktual_ertek += szam % 1.0 == 0 ? (int) szam : szam;
    }
   private void p_Kivon (double szam){
       aktual_ertek -= szam % 1.0 == 0 ? (int) szam : szam;
   }
   
   private void p_Szoroz (double szam){
       aktual_ertek*=szam % 1.0 == 0 ? (int) szam : szam;
   }
   
   private void p_Oszt(double szam) throws Exception{
       if(szam == 0)
           throw new Exception ("Nullával nem lehet osztani!");
       else
           aktual_ertek/=szam % 1.0 == 0 ? (int) szam : szam;       
   }
   
    private void doubleConvert(String szam, Operator operator) throws Exception {
        double dblSzam = Double.parseDouble(szam); //double
        switch (operator) {
            case OSSZEADAS:
                p_Osszead(dblSzam);
                break;
            case KIVONAS:
                p_Kivon(dblSzam);
                break;
            case SZORZAS:
                p_Szoroz(dblSzam);
                break;
            case OSZTAS:
                p_Oszt(dblSzam);
                break;
            default:
                throw new AssertionError(operator.name());
        }
    }
    
    /*
   A View felületen a gombok és az eventek hatására String típusú változókat kapunk.
   Ezért, hogy az eredményt meg tudjuk jeleníteni a View felületen az aktual_ertek változót át kell alakítani String típusúvá.
   */
   public String eredmeny_String() {
        return aktual_ertek % 1.0 == 0
                ? Integer.toString((int) aktual_ertek)
                : String.valueOf(aktual_ertek);
    }
   
    public void osszeadas(String szam) throws Exception {
        doubleConvert(szam, Operator.OSSZEADAS);
    }

    public void kivonas(String number) throws Exception {
        doubleConvert(number, Operator.KIVONAS);
    }

    public void szorzas(String number) throws Exception {
        doubleConvert(number, Operator.SZORZAS);
    }

    public void osztas(String number) throws Exception {
        doubleConvert(number, Operator.OSZTAS);
    }
}
