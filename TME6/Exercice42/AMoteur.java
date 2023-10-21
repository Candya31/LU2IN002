public class AMoteur extends Vehicule{
    private double reservoir;
    private double essence=0;

    public AMoteur(String marque , double distance, double reservoir, int essence){
        super(marque, distance);
        this.reservoir=reservoir;
        this.essence=essence;
    }

    public String toString(){
        return super.toString() + " avec moteur contenant un réservoir de " + reservoir + " et le niveau d'essence est de "+essence;
    }

    public void approvisionner(double nbLitres){
        
        if (essence+nbLitres <= reservoir){
            essence+=nbLitres;
        }
        System.out.println("Le réservoire est rempli");
    }

    public boolean enPanne() {
        if (this.essence==0){
            return true;
        }
        return false;
    }
}