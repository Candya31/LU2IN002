public class Vehicule {
    protected final int numeroID;
    private static int compteur=0;
    protected String marque;
    protected double distance=0;

    public Vehicule(String marque, double distance){
        compteur++;
        this.numeroID=compteur;
        this.marque = marque;
        this.distance=distance;
    }

    public String toString(){
        return numeroID+" de marque " + marque;
    }
}