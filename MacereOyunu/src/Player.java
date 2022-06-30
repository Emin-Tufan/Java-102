import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Player {
    private int orjinalHealth;
    private int damage;
    private int health;
    private int money;
    private String playerName;
    private String charName;
    private Inventory inventory;


    Scanner input = new Scanner(System.in);

    Player(String playerName) {

        this.money = 15;
        this.playerName = playerName;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        GameChar[] heros = {new Samurai(), new Archer(), new Knight()};

        System.out.println("--------------------------------------------------------");

        for (GameChar hero : heros) {
            System.out.println("ID: " + hero.getId() +
                    "\tKarakter: " + hero.getCharName() +
                    "\t Hasar: " + hero.getDamage() +
                    "\tSaglik: " + hero.getHealth() +
                    "\tPara: " + hero.getMoney());
        }
        System.out.println("--------------------------------------------------------");

        System.out.print("Bir Karakter Secin: ");
        int charId = input.nextInt();
        switch (charId) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }

    }

    public void initPlayer(GameChar gameChar) {
        System.out.println();
        this.setOrjinalHealth(gameChar.getHealth());
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getCharName());
    }


    public void printInfo() {
        System.out.println("Silahiniz: " + this.getInventory().getWeapon().getName() +
                "\tZirh: " + this.getInventory().getArmor().getName() +
                "\tBloklama: " + this.getInventory().getArmor().getBlock() +
                "\tHasariniz: " + this.getTotalDamage() +
                "\tSagliginiz: " + this.getHealth() +
                "\tParaniz: " + this.getMoney());
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }
}
