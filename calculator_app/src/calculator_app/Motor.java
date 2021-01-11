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
}