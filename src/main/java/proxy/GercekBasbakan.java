package proxy;

public class GercekBasbakan implements Basbakan {


    @Override
    public void dertDinle(String dert) {
        System.out.println("Basbakan: dinliyorum...");
    }

    @Override
    public void isBul(String yakinim) {
        System.out.println("Basbakan: Bana böyle isteklerle gelmeyin...");
    }
}
