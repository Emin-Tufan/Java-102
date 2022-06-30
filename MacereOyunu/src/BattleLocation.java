import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class BattleLocation extends Location {

    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLocation(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.award = award;
        this.maxObstacle = maxObstacle;
        this.obstacle = obstacle;

    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNum();
        System.out.println("Bulundugunuz yer: " + this.getName());
        System.out.println("Dikkatli Ol ! Burada " + obsNumber + " tane " + this.getObstacle().getName() + " Yasiyor !");
        System.out.println("<S> Savas -veya- <K> Kac");
        String selectBattleCase = input.nextLine();
        selectBattleCase = selectBattleCase.toUpperCase();

            if (selectBattleCase.equals("S")) {
                if (combat(obsNumber)) {
                    System.out.println(this.getName() + " Butun dusmanlari yendiniz !");
                    return true;
                }
            }
            if (this.getPlayer().getHealth() < 0) {
                System.out.println("Can : " + this.getPlayer().getHealth() + "\nGame Over !");
                return false;
            }
        return true;

    }

    public boolean combat(int obsNumber) {
        Random randomNum=new Random();

        for (int i = 1; i <= obsNumber; i++) {
            int random=randomNum.nextInt(1,3);
            this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());
            playerStats();
            obstacleStatus(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.println("<V>ur veya <K>ac");
                String selectCombat = input.nextLine();
                selectCombat = selectCombat.toUpperCase();

                if (selectCombat.equals("V")&&random%2==0) {
                    System.out.println("Siz vurdunuz ! ");
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth() > 0) {
                        System.out.println();
                        System.out.println(this.getObstacle().getName() + " Size Vurdu !");

                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamage < 0) {
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }
                }
                else if (selectCombat.equals("V")&&random%2==1) {
                    System.out.println("Once Canavar Vurdu ! ");
                    int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                    if (obstacleDamage < 0) {
                        obstacleDamage = 0;
                    }
                    this.getPlayer().setHealth(this.getPlayer().getHealth() - this.getObstacle().getDamage());
                    afterHit();
                    if (this.getPlayer().getHealth() > 0) {
                        System.out.println();
                        System.out.println("Siz Vurdunuz !");
                        this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getTotalDamage());
                        afterHit();
                    }
                }
                    else {
                    return false;
                }
            }
            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("Dusmani yendiniz ! ");
                this.getPlayer().getInventory().setItemList(this.getAward());
                System.out.println(this.getObstacle().getAward()+ randomObstacleNum()*5+ " Para kazandiniz ");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Guncel paraniz : " + this.getPlayer().getMoney());
            } else {
                return false;
            }
        }
        return false;
    }

    public void afterHit() {
        System.out.println("Caniniz :  " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Cani : " + this.getObstacle().getHealth());
        System.out.println();
    }

    public void playerStats() {
        System.out.println("Oyuncu degerleri");
        System.out.println("----------------------------------");
        System.out.println("Hasar :  " + this.getPlayer().getDamage());
        System.out.println("Silah :  " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Zirh :   " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Block :  " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Saglik : " + this.getPlayer().getHealth());
        System.out.println("Para :   " + this.getPlayer().getMoney());
        System.out.println("----------------------------------");

    }

    public void obstacleStatus(int i) {
        System.out.println(i + ". " + this.obstacle.getName() + " Degerleri");
        System.out.println("----------------------------------");
        System.out.println("Damage : " + this.obstacle.getDamage());
        System.out.println("Saglik : " + this.obstacle.getHealth());
        System.out.println("Odul :   " + this.obstacle.getAward());


        System.out.println("----------------------------------");

    }

    public int randomObstacleNum() {
        Random random = new Random();
        return random.nextInt(this.maxObstacle) + 1;


    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }


    public String getAward() {

        return award;
    }


    public void setAward(String award) {
        this.award = award;


    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
