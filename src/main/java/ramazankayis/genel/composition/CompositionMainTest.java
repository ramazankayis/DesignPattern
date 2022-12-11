package ramazankayis.genel.composition;

import java.util.ArrayList;

public class CompositionMainTest {
    public static void main(String[] args) {

        //yazar kitap
        Yazar yazar = new Yazar("ramazan");
        yazar.setKitapList(new ArrayList<Kitap>());

    Kitap kitap = new Kitap("react");
    kitap.setYazar(yazar);
    kitap.getYazar().getKitapList().add(kitap);

        Kitap kitap2 = new Kitap("Sping Boot");
        kitap2.setYazar(yazar);
        kitap2.getYazar().getKitapList().add(kitap2);

        System.out.println("********");
      //  System.out.println(yazar.getYazarAdi());
        for (Kitap temp:kitap2.getYazar().getKitapList()     ) {
            System.out.println(temp.getKitapAdi());
            System.out.println(temp.getYazar().getYazarAdi());
        }



    }
}
