public class TestMenagerie{
    public static void main(String[] args){

        Menagerie m = new Menagerie(5);

        m.ajouter(new Vache ("Alice", 20, 4));
        m.ajouter(new Boa ("Marc", 19));
        m.ajouter(new Vache ("Emilie",21,4));
        m.ajouter(new Boa("Python",5));

        System.out.println(m.toString());

        m.midi();
        m.vieillirTous();
        System.out.println(m.toString());

    }
}