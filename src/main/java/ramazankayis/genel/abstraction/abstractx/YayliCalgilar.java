package ramazankayis.genel.abstraction.abstractx;

import ramazankayis.genel.abstraction.interfacex.IBilgisayar;

import java.util.Date;

abstract public class YayliCalgilar implements IBilgisayar  {

    private String adi;
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public void deneme(){

        System.out.println("Deneme");
    }

   abstract String laptop();
   abstract  String laptopFiyati();

   abstract public void bilgisayarUretim(Date tarih);


}
