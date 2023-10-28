public class TestFigure{
    public static void main(String[] args){
        //Le type du tableau doit être Figure2D comme elle hérite de la méthode surface et contient perimètre.

        Figure2D[] f = new Figure2D[5];

        f[0]= new Carre(4);
        f[1]= new Cercle(5);
        f[2]= new Ellipse(6,7);
        f[3]=new Rectangle(10,4);

        for (int i = 0;  i < f.length; i++)
            if (f[i]!=null){
                System.out.println(String.format("%.2f", f[i].surface()));
                System.out.println(String.format("%.2f",f[i].perimetre()));
            }
    }
}
