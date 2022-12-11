package ramazankayis.genel.accessmodifier;

public class Access {

   public String isimSoyisim;
   private String  memleket;

    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }

    public String getMemleket() {
        return memleket;
    }

    public void setMemleket(String memleket) {
        this.memleket = memleket;
    }




    public void genelMethod(){
        System.out.println(isimSoyisim);


    }
}
