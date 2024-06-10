public class Spirituose extends  Getraenk {

    private double alkGehalt;


    public Spirituose(double volume,double alkGehalt) {
        super(volume);
        this.alkGehalt = alkGehalt;
    }

    @Override
    public String toString() {
        return "Spirituose{" +
                "alkGehalt=" + getAlkGehalt() +
                "%, volume=" + getVolume() +
                "ml}";
    }

    public double getAlkGehalt() {
        return alkGehalt;
    }

    public void setAlkGehalt(double alkGehalt) {
        this.alkGehalt = alkGehalt;
    }
}
