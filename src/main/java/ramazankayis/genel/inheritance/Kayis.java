package ramazankayis.genel.inheritance;

public class Kayis extends Person{

    private String futbolcu;
    public Kayis() {

    }
    public Kayis(String futbolcu) {
        this.futbolcu = futbolcu;
    }

    public Kayis(String adi, String soyadi, String futbolcu) {
        super(adi, soyadi);
        this.futbolcu = futbolcu;
    }


}
