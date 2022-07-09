import java.util.Comparator;
import java.util.TreeSet;

public class Brand {
    private int id;
    private String brand;

    public Brand(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    static TreeSet<Brand> brands = new TreeSet<>(new Comparator<Brand>() {
        @Override
        public int compare(Brand o1, Brand o2) {
            return o1.getBrand().compareTo(o2.getBrand());
        }
    });

    public static void createBrand() {
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenova"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));
    }

    public static void printProduct() {
        createBrand();
        System.out.println("######################");
        for (Brand b : brands) {
            System.out.println("Id : " + b.getId() + " Marka: " + b.getBrand());
        }
        System.out.println("######################");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static String getBrand(int id) {
        for (Brand b : brands) {
            if (b.getId() == id) {

                return b.getBrand();
            }
        }
        return null;
    }


}
