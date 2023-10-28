public class Vache extends AvecPattes{ 
    private double lait;

    public Vache(String nom,int age,int nbPattes){
        super(nom,age,nbPattes);
        this.lait=Math.random()*(25)+5;
    }

    public String toString(){
        return "Vache : " + super.toString()+" qui produit " + String.format("%.2f", lait) + " ml de lait tous les jours";
    }
    
    public void crier(){
        System.out.println("Meuuhhh");
    }
}