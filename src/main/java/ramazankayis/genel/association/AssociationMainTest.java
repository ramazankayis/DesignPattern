package ramazankayis.genel.association;

public class AssociationMainTest {
    public static void main(String[] args) {

        Musteri musteri= new Musteri("Ramazan","Kayış");
        Banka banka = new Banka("FibaBank","Çorum");

        System.out.println(musteri.getMusteriAdi() + " Association "+banka.getBankAdi() +" "+ banka.getBankaAdresi());
    }
}
