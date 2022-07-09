import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.util.Scanner;

public class Store {
    public static void menu() {
        System.out.print("PatiStore Yonetim Paneli !\n" +
                "1- Notebook Islemleri\n" +
                "2- Cep Telefonu Islemleri\n" +
                "3- Markalari Listele\n" +
                "4- Cikis Yap\n" +
                "Secim yapin : ");
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        switch (select) {
            case 1: NoteBook noteBook=new NoteBook();
            noteBook.controlMenu();
            break;
            case 2:MobilePhone mobilePhone=new MobilePhone();
            mobilePhone.controlMenu();
            break;
            case 3:
                Brand.printProduct();
                menu();
                break;

            case 4:
                System.out.println("HoscaKalin :)");
                break;

        }

    }
}
