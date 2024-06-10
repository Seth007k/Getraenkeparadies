public class Apfelsaft extends Saft implements  Igeschuettelt {

    private boolean klar = true;


    public Apfelsaft(double volume, boolean fruchtFleisch, boolean klar) {
        super(volume, fruchtFleisch);
        this.klar = klar;
    }

    @Override
    public String toString() {
        return "Apfelsaft{" +
                "klar=" + isKlar() +
                ", fruchtFleisch=" + isFruchtFleisch() +
                ", volume=" + getVolume() +
                "ml}";
    }

    public boolean isKlar() {
        return klar;
    }

    public void setKlar(boolean klar) {
        this.klar = klar;
    }

    @Override
    public void geschuettelt() {
        super.geschuettelt("Apfelsaft");

    }
}
