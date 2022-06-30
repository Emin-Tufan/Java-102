public class GameChar {
    private int money;
    private int health;
    private int damage;
    private String charName;
    private int id;

    public GameChar(int id, String charName, int damage, int health, int money) {
        this.id = id;
        this.charName = charName;
        this.money = money;
        this.health = health;
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
