public class SansMoteur extends Vehicule {

    public SansMoteur(String marque,double distance){
        super(marque, distance);
    }

    public String toString(){
        return super.toString()+" sans moteur ";
    }
}