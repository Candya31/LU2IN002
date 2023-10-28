public class Rectangle extends Figure2D{
    private double largueur;
    private double longueur;

    public Rectangle(double largueur, double longueur){
        this.largueur=largueur;
        this.longueur=longueur;
    }

    public double perimetre(){
        return 2*(longueur+largueur);
    }

    public double surface(){
        return longueur*largueur;
    }
}