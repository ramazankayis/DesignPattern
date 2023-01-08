package proxy;

public class VekilBasbakan implements Basbakan {

    private Basbakan gercekBasbakan;

    public VekilBasbakan(Basbakan gercekBasbakan) {
        this.gercekBasbakan = gercekBasbakan;

    }


    @Override
    public void dertDinle(String dert) {
        System.out.println("Vekil : Derdinizi dinliyorum.");
        boolean ayiklandi = ayikla(dert);
        if (ayiklandi) {
            ilet(dert);
        }

    }

    @Override
    public void isBul(String yakinim) {
        System.out.println("Vekil : isteğinizi dinliyorum..");

    }

    private boolean ayikla(String dert) {
        boolean b = true;
        return b;

    }

    private void ilet(String dert) {
        gercekBasbakan.dertDinle(dert);
    }
}
