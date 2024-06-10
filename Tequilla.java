public class Tequilla extends Spirituose{

    private String silbernTeq;

    public Tequilla(double volume, double alkGehalt, String silbernTeq) {
        super(volume, alkGehalt);
        this.silbernTeq = silbernTeq;
    }

    @Override
    public String toString() {
        return "Tequilla{" +
                "Art='" + getSilbernTeq() + '\'' +
                ", alkGehalt=" + getAlkGehalt() +
                "%, volume=" + getVolume() +
                "ml}";
    }

    public String getSilbernTeq() {
        return silbernTeq;
    }

    public void setSilbernTeq(String silbernTeq) {
        this.silbernTeq = silbernTeq;
    }
}
