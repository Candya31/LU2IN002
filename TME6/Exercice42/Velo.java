public class Velo extends SansMoteur{
    private int nbDeVitesse;

    public Velo(int nbDeVitesse, String marque, double distance){
        super(marque,distance);
        this.nbDeVitesse=nbDeVitesse;
    }

    public String toString(){
       return "Vélo " + super.toString() + nbDeVitesse + " vitesses";
    }

    public void transporter(String depart, String arrivee){
        System.out.println("Le vélo " + super.numeroID + " se déplace " + depart + " à " + arrivee);
    }

    public void rouler(double distance){
        this.distance+=distance;
        System.out.println(this.toString()+" a roulé " + this.distance + " km");
    }
}