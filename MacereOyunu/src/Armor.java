public class Armor {
    private int id;
    private String name;
    private int block;
    private int price;

    Armor(int id, String name, int block, int price) {
        this.id = id;
        this.block = block;
        this.name = name;
        this.price = price;
    }

    public static Armor[] armors() {
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor(1, "Hafif", 1, 15);
        armorList[1] = new Armor(2, "Orta", 3, 25);
        armorList[2] = new Armor(3, "Agir", 4, 40);

        return armorList;

    }
    public static Armor getArmorById(int id) {
        for (Armor armor : Armor.armors()) {
            if (armor.getId() == id) {
                return armor;
            }
        }
        return null;

    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBlock(int block) {

        this.block = block;
    }

    public int getBlock() {
        return this.block;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
