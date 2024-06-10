public class Getraenk{

    private double volume;

    public Getraenk(double volume) {
        this.volume = volume;

    }
    @Override
    public String toString() {
        return "Getraenk{" +
                "volume=" + volume +
                "ml}";
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
