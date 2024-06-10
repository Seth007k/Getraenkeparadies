public class Saft extends Getraenk  {

    private boolean fruchtFleisch = true;


    public Saft(double volume, boolean fruchtFleisch) {
        super(volume);
        this.fruchtFleisch = fruchtFleisch;
    }

    @Override
    public String toString() {
        return "Saft{" +
                "fruchtFleisch=" + fruchtFleisch +
                ", volume=" + getVolume() +
                "ml}";
    }

    public boolean isFruchtFleisch() {
        return fruchtFleisch;
    }

    public void setFruchtFleisch(boolean fruchtFleisch) {
        this.fruchtFleisch = fruchtFleisch;
    }

    public void geschuettelt(String getraenkeName) {
        System.out.println(getraenkeName + " wurde geschüttelt!");
    }

}
