import java.util.ArrayList;

public class TestTrain {
    public static void main(String[] args){

        Motrice m = new Motrice("TQT", 50);
        
        Train t = new Train(m);

        t.ajoute(new WMarchandise("RATP", 5, 50.0));
        t.ajoute(new WMarchandise("RATP", 5, 25.0));
        t.ajoute(new WMarchandise("RATP", 5, 60.0));
        t.ajoute(new WVoyageur("RATP", 5, 5));
        t.ajoute(new WVoyageur("SNCF", 6, 15));


        System.out.println("Le poids est " + t.poids());
        System.out.println(t.toString());


    }
    
}
