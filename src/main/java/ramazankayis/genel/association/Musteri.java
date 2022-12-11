package ramazankayis.genel.association;

public class Musteri {
    private String musteriAdi;
    private String musteriSoyadi;

    public Musteri() {
    }

    public Musteri(String musteriAdi, String musteriSoyadi) {
        this.musteriAdi = musteriAdi;
        this.musteriSoyadi = musteriSoyadi;
    }

    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    public String getMusteriSoyadi() {
        return musteriSoyadi;
    }

    public void setMusteriSoyadi(String musteriSoyadi) {
        this.musteriSoyadi = musteriSoyadi;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "musteriAdi='" + musteriAdi + '\'' +
                ", musteriSoyadi='" + musteriSoyadi + '\'' +
                '}';
    }
}
