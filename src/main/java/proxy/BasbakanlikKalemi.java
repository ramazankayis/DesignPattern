package proxy;

public class BasbakanlikKalemi {

    private Basbakan basbakan;

    public BasbakanlikKalemi(Basbakan basbakan) {
        this.basbakan = new VekilBasbakan(basbakan);

    }

    public Basbakan banaBasbakaniVer() {
        System.out.println("Basbakanlık kalemi : Tabi efendim");
        return basbakan;
    }

}
