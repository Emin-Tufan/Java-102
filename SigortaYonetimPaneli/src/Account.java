import java.util.ArrayList;

public class Account {
    private static User user = new User();

   public static ArrayList<Insurance>insurance=new ArrayList<>();



    public  static final void showUserInfo() {
        user.customerInfo();
        System.out.print("Isim : "+user.getName()+", SoyAd : "+user.getSurName()+", E-Posta : "+
                user.getEmail()+", Sifre : "+user.getPassword()+", Meslek : "+user.getJob()+
                ", Yas : "+user.getAge()+", Tarih : "+user.getLastDate()+"\n");
    }

}
