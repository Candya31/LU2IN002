public abstract class Animal {
    private String nom;
    private int age;
    

    public Animal(String nom, int age){
        this.nom=nom;
        this.age=age;
    }

    public Animal(String nom){
        this(nom,1);
    }

    public String toString() {
        return "Il s'agit d'un " + nom + " et il a " + age + " ans";
    }

    public void vieillir(){
        this.age+=1;
    }

    public abstract void crier();

    //Non on ne peut pas car c'est spécifique à chaque animal.
}

