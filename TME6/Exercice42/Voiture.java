public class Voiture extends AMoteur {
    private int places;

    public Voiture(String marque, double distance, double reservoir, int essence, int places){
        super(marque, distance, reservoir, essence);
        this.places=places;
    }
    public String toString(){
        return "Voiture " + super.toString();
    }

    public void transporter(int nbPers, int km){
        if (places<nbPers){
            System.out.println("Trop de monde, pas assez de place pour transporter toutes les personnes");
        } else {
            if (super.enPanne()==false){
                System.out.println("La voiture " + super.numeroID + " transporte " + nbPers + " personnes sur " + km + " km");
            }
            else {
                System.out.println("La voiture " + super.numeroID + " n'a plus d'esscence ! ");
            }
        }
    }

    
    
}
