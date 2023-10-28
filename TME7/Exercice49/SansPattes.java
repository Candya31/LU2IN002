public abstract class SansPattes extends Animal{

    public SansPattes(String nom, int age){
        super(nom,age);
    }

    public String toString(){
        return super.toString() + " qui n'a pas de pattes ";
    }
}