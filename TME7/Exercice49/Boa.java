public class Boa extends SansPattes{

    public Boa(String nom, int age){
        super(nom,age);
    }

    public String toString(){
        return "Boa : " + super.toString();
    }

    public void crier(){
        System.out.println("Sssss");
    }
}