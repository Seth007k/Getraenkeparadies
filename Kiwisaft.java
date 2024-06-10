public class Kiwisaft extends Saft implements Igeschuettelt{


    public Kiwisaft(double volume, boolean fruchtFleisch) {
        super(volume, fruchtFleisch);
    }

    @Override
    public String toString() {
        return "Kiwisaft{"+
                ", fruchtFleisch=" + isFruchtFleisch() +
                ", volume=" + getVolume() +
                "ml}";
    }



    public void geschuettelt() {
        super.geschuettelt(" Kiwisaft");
    }
}





