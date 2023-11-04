public class Motrice extends ElemTrain {
    protected double puissance;

    public Motrice(String marque, double puissance){
        super(marque);
        this.puissance=puissance;
    }

    public String toString(){
        return "Motrice " + super.toString();
    }
}
