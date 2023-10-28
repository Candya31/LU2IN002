public class Menagerie {
    private Animal[] tab;
    private int cpt=0;

    public Menagerie(int taille){
        this.tab = new Animal[taille];
    }
    public void ajouter(Animal a){
        if(cpt<tab.length){
            tab[cpt]=a;
            cpt++;
        }
        else {
            System.out.println("Pas de place pour ajouter un animal");
        }
    }

    public String toString(){
        String res = "";

        for (int i = 0; i<cpt; i++){
            res=res+"\n"+tab[i];
        }
        return res;
    }

    public void midi(){
        for (int i = 0; i< cpt; i++){
            tab[i].crier();
        }
    }

    public void vieillirTous(){
        for (int i = 0; i < cpt; i++){
            tab[i].vieillir();
        }
    }

}