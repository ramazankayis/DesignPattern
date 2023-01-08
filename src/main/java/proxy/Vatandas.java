package proxy;

public class Vatandas {

    private Basbakan basbakan;
    public Vatandas(BasbakanlikKalemi kalem){
        this.basbakan= kalem.banaBasbakaniVer();
    }
    public String derdiniAnlat(){
        basbakan.dertDinle("bir derdim var ....");
        return "Yaşasın dinlediler beni !!!!";
    }
    public String isIste(){
        basbakan.isBul("oğlum");
        return "Oğlumu işe alacaklar";
    }
}
