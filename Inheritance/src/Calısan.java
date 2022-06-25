public class Calısan {
    private String adSoyad;
    private String telefon;
    private String eposta;

    Calısan(String adSoyad, String telefon, String eposta) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    public void giris() {
        System.out.println(this.adSoyad + " Giris yapti");

    }

    public void cikis() {
        System.out.println(this.adSoyad + " Cikis yapti");
    }
    public  void yemekhane(){
        System.out.println(this.adSoyad+" Yemekhaneye giris yapti");
    }



}
