import java.util.ArrayList;

public class Train {
    private Motrice m;
    private ArrayList <Wagon> wag;

    public Train(Motrice m){
        this.m=m;
        this.wag = new ArrayList<>();

    }

    public void ajoute(Wagon w){
        wag.add(w);
    }

    public String toString(){

        String res = " ";

        if (wag.size()==0){
            return "Pas de Wagon";
        }

        for (int i=0; i<wag.size(); i++){
            Wagon f = wag.get(i);
            res+= f.toString();
        }

        return res;
    }

    public double poids(){  
        double total = 0;

        for (int i = 0; i<wag.size(); i++){
            total+=wag.get(i).getPoids();
        }

        return total;
   }

}
