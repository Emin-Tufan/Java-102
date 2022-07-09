import javax.swing.*;
import java.util.ArrayList;

public class NoteBook extends Product {

    ArrayList<NoteBook> noteBooks = new ArrayList<>();

    public NoteBook(int productId, String productName, int price, String brand, int memory,
                    double screenSize, int ram, double discountRate, int stock) {
        super(productId, productName, price, discountRate, stock, brand, memory, screenSize, ram);
    }

    public NoteBook() {

    }

    @Override
    void controlMenu() {
        boolean isControl = true;
        while (isControl) {
            System.out.print("**NoteBook Islemleri***\n" +
                    "1- NoteBooklari Goster\n" +
                    "2- Yeni NoteBook Ekle\n" +
                    "3- NoteBook Sil\n" +
                    "4- NoteBook Marka Filtrele\n" +
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

    @Override
    void showProduct() {
        if (noteBooks.isEmpty()) {
            defaultProduct();
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------\n" +
                "| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran       |RAM   \n" +
                "--------------------------------------------------------------------------------------------------------------------------------------");
        for (NoteBook s : noteBooks) {
            System.out.println("|" + s.getProductId() + "  | " + s.getProductName() + "                      | " + s.getPrice() + "TL     | " + s.getBrand() + "     | " + s.getMemory() + "  | " + s.getScreenSize() + "       |" + s.getRam());


        }


    }

    private void defaultProduct() {

        Brand.createBrand();
        noteBooks.add(new NoteBook(1, "HUAWEI MateBook 14", 7000, Brand.getBrand(4), 512, 14, 16, 15, 96));
        noteBooks.add(new NoteBook(2, "LENOVO V14 IGL    ", 3699, Brand.getBrand(2), 1024, 14, 8, 25, 43));
        noteBooks.add(new NoteBook(3, "ASUS Tuf Gaming   ", 8199, Brand.getBrand(6), 2048, 15.6, 32, 12, 54));
    }

    @Override
    void addProduct() {
        if (noteBooks.isEmpty()) {
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
        System.out.print("Urunun Ram'ini girin : ");
        this.setRam(input.nextInt());
        System.out.print("Urunun indirim Oranini girin : ");
        this.setDiscountRate(input.nextDouble());
        System.out.print("Urunun stock Miktarini girin : ");
        this.setStock(input.nextInt());
        this.noteBooks.add(new NoteBook(this.getProductId(), this.getProductName(), this.getPrice(), this.getBrand(), this.getMemory(), this.getScreenSize(), this.getRam(), this.getDiscountRate(), this.getStock()));


    }

    @Override
    void removeProduct() {
        if (noteBooks.isEmpty()) {
            defaultProduct();
        }
        System.out.print("Silmek Istediginiz Urunun ID'sini Girin : ");
        Integer select = input.nextInt();
        for (NoteBook s : noteBooks) {
            if (s.getProductId() == select) {
                noteBooks.remove((select - 1));
                break;
            }
            else
                System.out.println("Liste Bos");
        }



    }

    @Override
    void filterProduct() {
        ArrayList<NoteBook> newNoteBook = new ArrayList<>();
        if (newNoteBook.isEmpty()) {
            defaultProduct();
        }
        System.out.print("Filtrelemek Istediginiz Urunun Id'sini Girin : ");
        int select = input.nextInt();
        for (NoteBook s : noteBooks) {
            if (s.getProductId() == select) {
                newNoteBook.add(s);
                break;
            }
        }
        System.out.print("Filtrelenen NoteBooklar");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------\n" +
                "| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran       |RAM   \n" +
                "--------------------------------------------------------------------------------------------------------------------------------------");
        for (NoteBook s : newNoteBook) {
            System.out.println("|" + s.getProductId() + "  | " + s.getProductName() + "                      | " + s.getPrice() + "TL     | " + s.getBrand() + "     | " + s.getMemory() + "  | " + s.getScreenSize() + "       |" + s.getRam());

        }

    }
}
