import java.util.ArrayList;
import java.util.Calendar;

public class MobilePhone extends Product {
    private int battery;
    private String colour;
    private double camera;
    ArrayList<MobilePhone> mobilePhones = new ArrayList<>();

    public MobilePhone(int productId, String productName, int price,
                       String brand, int memory, double screenSize, double camera, int battery, int ram, String colour, double discountRate, int stock) {
        super(productId, productName, price, discountRate, stock, brand, memory, screenSize, ram);
        this.battery = battery;
        this.colour = colour;
        this.camera = camera;
    }

    public MobilePhone() {

    }

    @Override
    void controlMenu() {
        boolean isControl = true;
        while (isControl) {
            System.out.print("**Telefon  Islemleri***\n" +
                    "1- Telefonlari Goster\n" +
                    "2- Yeni Telefon Ekle\n" +
                    "3- Telefon  Sil\n" +
                    "4- Telefon Marka Filtrele\n" +
                    "5- Ust Menuye Cik\n" +
                    "6- Cikis Yap\n" +
                    "Lutfen Islem Secin : ");
            int select = input.nextInt();
            switch (select) {
                case 1:
                    showProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    filterProduct();
                    break;
                case 5:
                    Store.menu();
                    break;
                case 6:
                    System.out.println("Yine bekleriz !");
                    isControl = false;
                    break;

                default:
            }
        }

    }

    private void defaultProduct() {
        mobilePhones.add(new MobilePhone(1, "SAMSUNG GALAXY A51", 3199, "Samsung", 128, 6.5, 32, 4000, 6, "Siyah", 25, 73));
        mobilePhones.add(new MobilePhone(2, "Iphone 11 64 GB", 7379, "Apple", 64, 6.1, 5, 3046, 6, "Mavi", 25, 73));
        mobilePhones.add(new MobilePhone(3, "Redmi Note 10 Pro 8GB", 4012, "Xiaomi", 128, 6.5, 35, 4000, 12, "Beyaz", 25, 73));
    }

    @Override
    void showProduct() {
        Brand.createBrand();
        if (mobilePhones.isEmpty()) {
            defaultProduct();
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------\n" +
                "| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran       |RAM   \n" +
                "--------------------------------------------------------------------------------------------------------------------------------------");
        for (MobilePhone s : mobilePhones) {
            System.out.println("|" + s.getProductId() + "  | " + s.getProductName() + "                      | " + s.getPrice() + "TL     | " + s.getBrand() + "     | " + s.getMemory() + "  | " + s.getScreenSize() + "       |" + s.getRam());


        }


    }

    @Override
    void addProduct() {
        Brand.createBrand();

        if (mobilePhones.isEmpty()) {
            defaultProduct();
        }

        System.out.print("Urunun Ismini girin : ");
        this.setProductName(input.next());
        System.out.print("Urunun Fiyatini girin : ");
        this.setPrice(input.nextInt());
        boolean isControl = true;
        System.out.print("Urunun Id'sini girin : ");
        this.setProductId(input.nextInt());
        System.out.print("Urunun Markasini girin : ");
        this.setBrand(input.next());
        System.out.print("Urunun hafizasini girin : ");
        this.setMemory(input.nextInt());
        System.out.print("Urunun ekranini girin : ");
        this.setScreenSize(input.nextDouble());
        System.out.print("Urunun Kamera Cozunurlugunu Girin : ");
        this.setCamera(input.nextDouble());
        System.out.print("Urunun Pilini Girin : ");
        this.setBattery(input.nextInt());
        System.out.print("Urunun Ram'ini girin : ");
        this.setRam(input.nextInt());
        System.out.print("Urunun Rengini Girin : ");
        this.setColour(input.next());
        System.out.print("Urunun indirim Oranini girin : ");
        this.setDiscountRate(input.nextDouble());
        System.out.print("Urunun stock Miktarini girin : ");
        this.setStock(input.nextInt());
        this.mobilePhones.add(new MobilePhone(this.getProductId(), this.getProductName(), this.getPrice(), this.getBrand(), this.getMemory(), this.getScreenSize(), this.getCamera(), this.getBattery(), this.getRam(), this.getColour(), this.getDiscountRate(), this.getStock()));


    }

    @Override
    void removeProduct() {
        if (mobilePhones.isEmpty()) {
            defaultProduct();
        }
        System.out.print("Silmek Istediginiz Urunun ID'sini Girin : ");
        int select = input.nextInt();
        for (MobilePhone s : mobilePhones) {
            if (s.getProductId() == select) {
                mobilePhones.remove(select-1);
                break;
            }
            else
                System.out.print("Liste Bos");
        }


    }

    @Override
    void filterProduct() {
        ArrayList<MobilePhone> newMobilePhone = new ArrayList<>();
        if (newMobilePhone.isEmpty()) {
            defaultProduct();
        }
        System.out.print("Filtrelemek Istediginiz Urunun Id'sini Girin : ");
        int select = input.nextInt();
        for (MobilePhone s : mobilePhones) {
            if (s.getBrand() == s.getBrand()) {
                newMobilePhone.add(s);
                break;
            }
        }
        System.out.print("Filtrelenen NoteBooklar");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------\n" +
                "| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran       |RAM   \n" +
                "--------------------------------------------------------------------------------------------------------------------------------------");
        for (MobilePhone s : mobilePhones) {
            System.out.println("|" + s.getProductId() + "  | " + s.getProductName() + "                      | " + s.getPrice() + "TL     | " + s.getBrand() + "     | " + s.getMemory() + "  | " + s.getScreenSize() + "       |" + s.getRam());


        }

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public double getCamera() {
        return camera;
    }

    public void setCamera(double camera) {
        this.camera = camera;
    }
}
