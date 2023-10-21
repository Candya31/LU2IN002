public class TestVehicule {
    public static void main(String[] args){
        Velo v1 = new Velo(17, "myVTT", 0);
    
        System.out.println(v1);
        v1.transporter("Paris", "Lyon");
        v1.rouler(10.0);
        v1.rouler(50.0); //+50 km

        Voiture v = new Voiture("Seat", 0, 50, 10,5);

        System.out.println(v);
        v.transporter(5, 200); //OK
        
        v.transporter(6, 100); //pas de place
        
        Camion c = new Camion("Renault", 0, 150, 90);
        Camion c2 = new Camion ("Renault", 50, 150, 0);

        System.out.println(c);
        c.transporter("tuiles", 500); //OK
        System.out.println(c2);
        c2.transporter("tuiles", 500); // pas d'essence

        //Non ce n'est pas possible de factoriser la déclaration de transporter car ça dépend du type de transports.
    }
}
