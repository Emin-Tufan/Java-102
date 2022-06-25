public class OgretimGorevlisi extends Akademisyen {
    private int kapiNo;

    OgretimGorevlisi(String adSoyad,String telefon  ,String eposta,String bolum,String unvan,int kapiNo){
        super(adSoyad,telefon,eposta,bolum,unvan);
        this.kapiNo=kapiNo;

    }
    public void setKapiNo(int kapiNo){
        this.kapiNo=kapiNo;
    }
    public int getKapiNo(){
        return this.kapiNo;
    }
    public void senatoToplantı(){

    }
    public void sinavYap(){

    }

}
