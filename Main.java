import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Getraenk erstesGetraenk = new Getraenk(250);
        System.out.println(erstesGetraenk);

        Saft ersterSaft = new Saft(200,true);
        System.out.println(ersterSaft);

        Spirituose ersteSpirituose = new Spirituose(0.2,55);
        System.out.println(ersteSpirituose);

        Apfelsaft ersterApfelsaft = new Apfelsaft(500,false,true);
        System.out.println(ersterApfelsaft);

        Kiwisaft ersterKiwisaft = new Kiwisaft(400,false);
        System.out.println(ersterKiwisaft);

        Vodka ersterVodka = new Vodka(0.2,45,"lemon");
        System.out.println(ersterVodka);

        Tequilla ersterTequilla = new Tequilla(0.2,45,"Silber");
        System.out.println(ersterTequilla);


        ArrayList<Igeschuettelt> schuettelListe = new ArrayList<Igeschuettelt>();

        schuettelListe.add(ersterVodka);
        schuettelListe.add(ersterApfelsaft);
        schuettelListe.add(ersterKiwisaft);

        schuettelAll(schuettelListe);

    }
        public static void schuettelAll(ArrayList<Igeschuettelt> schuettelListe){

            for(int i = 0; i < schuettelListe.size(); i++){
                Igeschuettelt getraenk = schuettelListe.get(i);
                getraenk.geschuettelt();
            }
        }
}
