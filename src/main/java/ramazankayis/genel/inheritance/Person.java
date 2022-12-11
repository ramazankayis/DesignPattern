package ramazankayis.genel.inheritance;

public class Person {
    private String adi;
    private String soyadi;

    public Person(){

    }
    public Person(String adi, String soyadi) {

        this.adi = adi;
        this.soyadi = soyadi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }
}
