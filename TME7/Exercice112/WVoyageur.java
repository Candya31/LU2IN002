public class WVoyageur extends Wagon {
    private int nbPlaces;

    public WVoyageur(String marque, int nbPortes, int nbPlaces){
        super(marque, nbPortes);
        this.nbPlaces=nbPlaces;
    }

    public String toString(){
        return "Wagon Voyageur " + super.toString();
    }

}
