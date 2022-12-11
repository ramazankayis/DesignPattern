package ramazankayis.genel.composition;

import java.io.Serializable;
import java.util.List;

//1
public class Yazar implements Serializable {
    private String yazarAdi;
    //composition : has -a

    private List<Kitap> kitapList;
    public Yazar(){

    }

    public Yazar(String yazarAdi) {

        this.yazarAdi = yazarAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public List<Kitap> getKitapList() {
        return kitapList;
    }

    public void setKitapList(List<Kitap> kitapList) {
        this.kitapList = kitapList;
    }
}
