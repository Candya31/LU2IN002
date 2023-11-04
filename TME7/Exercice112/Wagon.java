public abstract class Wagon extends ElemTrain {
    protected int nbPortes;

    public Wagon(String marque, int nbPortes){
        super(marque);
        this.nbPortes=nbPortes;
    }

    public String toString(){
        return super.toString(); 
    }

    public double getPoids(){
        if (this instanceof WMarchandise){
            return this.getPoids();
        } else {
            return 0;
        }
    }
}