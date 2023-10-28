public abstract class AvecPattes extends Animal{
    private int nbPattes;


    public AvecPattes(String nom, int age, int nbPattes){
        super(nom,age);
        this.nbPattes=nbPattes;
    }

    public String toString(){
        return super.toString()+ " qui a " + nbPattes+ " pattes ";
    }
}
