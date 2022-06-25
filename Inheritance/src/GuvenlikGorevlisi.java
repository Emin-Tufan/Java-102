public class GuvenlikGorevlisi extends  Memur{

    private String belge;
    private int nobet;
    GuvenlikGorevlisi(String adSoyad,String telefon,String eposta,String departman,String mesai,int nobet,String belge){
        super(adSoyad, telefon, eposta, departman, mesai);
        this.belge=belge;
        this.nobet=nobet;
    }
    public int getNobet(){
        return this.nobet;
    }
    public String getBelge(){
        return this.belge;
    }
    public void setBelge(String belge){
        this.belge=belge;

    }
    public void setNobet(int nobet){
        this.nobet=nobet;
    }

}
