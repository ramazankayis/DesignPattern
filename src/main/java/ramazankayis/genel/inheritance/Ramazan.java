package ramazankayis.genel.inheritance;

public class Ramazan extends Person{

    private String futbolcu;

    public Ramazan(){

    }
    public Ramazan(String futbolcu) {
        this.futbolcu = futbolcu;
    }
    public Ramazan(String adi, String soyadi, String futbolcu) {
        super(adi, soyadi);
        this.futbolcu = futbolcu;
    }


}
