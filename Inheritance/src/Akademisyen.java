public class Akademisyen extends Calısan {
    private String bolum;
    private String unvan;

    Akademisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adSoyad, telefon, eposta);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public void derseGir() {
        System.out.println(this.bolum + "Dersine girin");
    }

    public String getBolum() {
        return this.bolum;
    }

    public String getUnvan() {
        return this.unvan;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }


}
