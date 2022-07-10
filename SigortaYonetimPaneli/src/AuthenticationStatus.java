import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public enum AuthenticationStatus {
    SUCCESS, FAİL;


    public static Enum<AuthenticationStatus> login() {
        System.out.print("e-Postanizi Tekrar girin : ");
        String eposta = AdressManager.input.next().toLowerCase();
        System.out.print("Sifrenizi Girin : ");
        String password = AdressManager.input.next().toLowerCase();
        if (User.getEmail().equals(eposta.toLowerCase())&&User.getPassword().equals(password)){
            System.out.println(SUCCESS);
            return SUCCESS;
        }
        else {
            System.out.println(FAİL+"\n" +
                    "Giris Basarisiz ");
            return FAİL;

        }

    }

}
