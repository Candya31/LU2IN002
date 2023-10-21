public class Camion extends AMoteur {
    public Camion (String marque, double distance, double reservoir, int essence){
        super(marque, distance, reservoir, essence);
    }

    public String toString(){
        return "Le camion " + super.toString();
    }

    public void transporter(String materiau, int km){
        if (enPanne()==false){
            System.out.println("Le camion " + super.numeroID + " a transporté des " +materiau+ " sur " + km);
        }
        else {
            System.out.println("Le camion " + super.numeroID + " n'a plus d'essence !");
        }
    }


}
