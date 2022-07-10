import java.util.Scanner;

public class AdressManager extends Insurance {

    BusinessAddress businessAddress = new BusinessAddress();
    HomeAddress homeAddress = new HomeAddress();
    static Scanner input = new Scanner(System.in);


    public void selectAdress() {
        System.out.print("1- Ev addressi Islemi \n" +
                "2- Is Adressi Islemi  \n" +
                "Islem Turu Secin ");
        int select = input.nextInt();
        if (select == 1) {
            System.out.print("1- Ev Adressi Ekleme Islemi  \n" +
                    "2- Ev Adressi Silme Islemi \n" +
                    "Islem Turu Secin : ");
            int select1 = input.nextInt();
            switch (select1) {
                case 1:
                    addHomeAdress();
                    break;
                case 2:
                    removeHomeAdress();
                    break;
                default:
                    break;
            }
        } else if (select == 2) {
            System.out.print("1- Is Adressi Ekleme Islemi\n" +
                    "2- Is Adressi Silmi Islemi \n" +
                    "3- Islem Turu Secin : ");
            int select1 = input.nextInt();
            switch (select1) {
                case 1:
                    addJobAdress();
                    break;
                case 2:
                    removeJobAdress();
                    break;
                default:
                    break;

            }
        } else {
            System.out.print("Gecersiz Islem Yaptiniz Dikkati Tuslama Yapin ! ");
        }
    }

    public void insurunceRegist() {
        boolean isControl = true;
        AdressManager insuranceAdressManager = new AdressManager();
        while (isControl) {
            System.out.println("1- Saglik Sigortasi  \n" +
                    "2- Seyahat Sigortasi  \n" +
                    "3- Konut Sigortasi  \n" +
                    "4- Arac Sigortasi" +
                    "************************");
            System.out.print("Sigorta Adini Girin : ");
            insuranceAdressManager.setFuseName(input.next());
            if (this.getFuseName() == "saglik sigortasi") {
                HealthInsurance healthInsurance=new HealthInsurance();
                insuranceAdressManager.setFusePrice(healthInsurance.calculate());
                isControl = false;

            } else if (this.getFuseName() == "seyahat sigortasi") {
                TravelInsurance travelInsurance=new TravelInsurance();
                insuranceAdressManager.setFusePrice(travelInsurance.calculate());
                isControl = false;


            } else if (this.getFuseName() == "konut sigortasi") {
                ResidenceInsurance residenceInsurance=new ResidenceInsurance();
                insuranceAdressManager.setFusePrice(residenceInsurance.calculate());

                isControl = false;
            }
            else if (this.getFuseName()=="arac sigortasi"){
                CarInsurance carInsurance=new CarInsurance();
                carInsurance.calculate();
                insuranceAdressManager.setFusePrice(carInsurance.calculate());
                isControl=false;
            }
            else {
                System.out.println("Gecerli Sigorta Turu Girin ");
            }
        }

        System.out.print("Sigorta Baslangic Bitis Tarihini Girin : ");
        insuranceAdressManager.setStartFinshDate(input.next());
        Account.insurance.add(insuranceAdressManager);
    }

    public void addJobAdress() {
        System.out.print("Adres Id'sini girin : ");
        businessAddress.setAddressId(input.nextInt());
        System.out.print("Sehir Adini Girin : ");
        businessAddress.setCity(input.next());
        System.out.print("Semt Adini  Girin : ");
        businessAddress.setDistrict(input.next());
        System.out.print("Sokak Adini Girin : ");
        businessAddress.setStreet(input.next());
        BusinessAddress newBusinessAdress = new BusinessAddress(this.businessAddress.getAddressId(), this.businessAddress.getCity(), this.businessAddress.getDistrict(), this.businessAddress.getStreet());
        User.adressLists.add(newBusinessAdress);


    }

    public void addHomeAdress() {
        System.out.print("Adres Id'sini girin : ");
        homeAddress.setAddressId(input.nextInt());
        System.out.print(" Sehir Adini Girin : ");
        homeAddress.setCity(input.next());
        System.out.print("Semt Adini  Girin : ");
        homeAddress.setDistrict(input.next());
        System.out.print("Sokak Adini Girin : ");
        homeAddress.setStreet(input.next());
        HomeAddress newHomeAdress = new HomeAddress(this.businessAddress.getAddressId(), this.businessAddress.getCity(), this.businessAddress.getDistrict(), this.businessAddress.getStreet());
        User.adressLists.add(newHomeAdress);

    }

    public void removeJobAdress() {
        System.out.println("Silmek Istediginiz Is Adrsinin Id'sini Girin");
        int select = input.nextInt();
        if (User.adressLists.isEmpty())
            System.out.print("Adres Listesi Bos");
        else {
            try {
                User.adressLists.remove(select);
                System.out.print("Secilen Id Adrssi Silindi ");
            } catch (Exception e) {
                System.out.print("Girilen Id bulunamadi !");
            }
        }

    }

    public void removeHomeAdress() {
        System.out.println("Silmek Istediginiz Ev Adrsinin Id'sini Girin");
        int select = input.nextInt();
        if (User.adressLists.isEmpty())
            System.out.print("Adres Listesi Bos");
        else {
            try {
                User.adressLists.remove(select);
                System.out.print("Secilen Id Adrssi Silindi ");
            } catch (Exception e) {
                System.out.print("Girilen Id bulunamadi !");
            }
        }

    }
}
