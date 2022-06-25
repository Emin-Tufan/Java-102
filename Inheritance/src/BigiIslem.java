public class BigiIslem extends Memur{
    private String gorev;


    public BigiIslem(String adSoyad, String telefon, String eposta, String departman, String mesai) {
        super(adSoyad, telefon, eposta, departman, mesai);
    }
    public void setGorev(String gorev) {

        this.gorev = gorev;
    }

    public String getGorev() {
        return gorev;
    }
}
