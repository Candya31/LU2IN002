public abstract class ElemTrain{
    protected int serie;
    protected static int cpt=10000;
    protected String marque;

    public ElemTrain(String marque){
        serie=cpt;
        cpt++;
        this.marque=marque;
    }

    public String toString(){
        return serie + "( " + marque + " ) ";
    }


}