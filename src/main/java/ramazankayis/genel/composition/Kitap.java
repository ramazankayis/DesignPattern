package ramazankayis.genel.composition;

import java.io.Serializable;
//N
public class Kitap implements Serializable {
    private String kitapAdi;

    //composition : has -a
    private Yazar yazar;
    public Kitap(){


    }

    public Kitap(String kitapAdi) {
        super();
        this.kitapAdi = kitapAdi;
    }


    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }
    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }
}
