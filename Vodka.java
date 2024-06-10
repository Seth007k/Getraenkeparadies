public class Vodka extends Spirituose implements  Igeschuettelt{

    private String aroma;


    public Vodka(double volume, double alkGehalt, String aroma) {
        super(volume, alkGehalt);
        this.aroma = aroma;
    }

    @Override
    public String toString() {
        return "Vodka{" +
                "aroma='" + getAroma() + '\'' +
                ", alkGehalt=" + getAlkGehalt() +
                "%, volume=" + getVolume() +
                "ml}";
    }



    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    @Override
    public void geschuettelt() {
        System.out.println(" Vodka wurde geschüttelt!");
    }
}
