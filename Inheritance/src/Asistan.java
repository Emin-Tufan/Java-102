public class Asistan extends Akademisyen {
    private int ofisSaati;

    Asistan(String adSoyad, String telefon, String eposta, String bolum, String unvan, int ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.ofisSaati = ofisSaati;
    }

    public void setOfisSaati(int ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    public int getOfisSaati() {
        return this.ofisSaati;
    }
    public  void quizYap(){

    }

}
