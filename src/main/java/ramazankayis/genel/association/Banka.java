package ramazankayis.genel.association;

public class Banka {
    private String bankAdi;
    private String bankaAdresi;

    public Banka() {

    }

    public Banka(String bankAdi, String bankaAdresi) {
        this.bankAdi = bankAdi;
        this.bankaAdresi = bankaAdresi;
    }

    public String getBankAdi() {
        return bankAdi;
    }

    public void setBankAdi(String bankAdi) {
        this.bankAdi = bankAdi;
    }

    public String getBankaAdresi() {
        return bankaAdresi;
    }

    public void setBankaAdresi(String bankaAdresi) {
        this.bankaAdresi = bankaAdresi;
    }

    @Override
    public String toString() {
        return "Banka{" +
                "bankAdi='" + bankAdi + '\'' +
                ", bankaAdresi='" + bankaAdresi + '\'' +
                '}';
    }
}
