public class WMarchandise extends Wagon {
    private double poids;

    public WMarchandise(String marque, int nbPortes, double poids){
        super(marque, nbPortes);
        this.poids=poids;
    }
    
    public String toString(){
        return "Wagon Marchandise " + super.toString();
    }

    public double getPoids(){
        return this.poids;
    }
    
}
