package proxy;

public class Test {
    public static void main(String[] args) {
        System.out.println("***************Süreç başlar********************");

        Basbakan basbakan=new GercekBasbakan();
        BasbakanlikKalemi kalem= new BasbakanlikKalemi(basbakan);

        Vatandas ramazan= new Vatandas(kalem);
        ramazan.derdiniAnlat();
        ramazan.isIste();
    }
}
