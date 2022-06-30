import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Game {

    public void strat() {

        Scanner input = new Scanner(System.in);
        System.out.println("Macera Oyununa Hosgeldiniz..");
        System.out.print("Lutfen bir isim giriniz: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getPlayerName() + " Hosgeldiniz.. ");
        player.selectChar();
        Location location = null;


        while (true) {
            if (player.getInventory().getItemList().contains("Food")&&player.getInventory().getItemList().contains("Water")&&player.getInventory().getItemList().contains("FireWood")) {
                System.out.println("TEBRIKLER TUM ESYALARI TOPLADINIZ, OYUNU KAZANDINIZ !");
                break;
            } else {
                player.printInfo();
                System.out.println("########BOLGELER########");
                System.out.println("----------------------------------------------------------------");
                System.out.println("1-Guvenli ev-->Burasi sizin icin guvenli bir ev,dusman yoktur !");
                System.out.println("2-Esya Dukkani--> o Silah veya Zirh satin alabilirsiniz !");
                System.out.println("3-Magaraya git--> Odul<Yemek> Dikkatli ol burada ZOMBI cikabilir !");
                System.out.println("4-Ormana git--> Odul<Odun> Dikkatli ol  burada VAMPIR cikabilir !");
                System.out.println("5-Nehire git--> Odul<Su> Dikkatli ol burada AYI cikabilir !");
                System.out.println("----------------------------------------------------------------");
                System.out.println("Lutfen gitmek istediginiz bolgeyi seciniz:");
                int region = input.nextInt();


                switch (region) {
                    case 1:
                        location = new SafeHouse(player);
                        break;
                    case 2:
                        location = new ToolStore(player);
                        break;
                    case 3:
                        if (player.getInventory().getItemList().contains("Food")) {
                            System.out.println("Buradaki canavarlari daha once yendiniz !\n Yeni yer secin");
                            continue;
                        } else {
                            location = new Cave(player);
                            break;
                        }
                    case 4:
                        if (player.getInventory().getItemList().contains("FireWood")) {
                            System.out.println("Buradaki canavarlari daha once yendiniz !\n Yeni yer secin");
                            continue;
                        } else {
                            location = new Forest(player);
                            break;
                        }
                    case 5:
                        if (player.getInventory().getItemList().contains("Water")) {
                            System.out.println("Buradaki canavarlari daha once yendiniz !\n Yeni yer secin");
                            continue;
                        } else {
                            location = new River(player);
                            break;
                        }
                    default:
                        System.out.println("Lutfen gecerli bir bolge girin !");
                        break;
                }
                if(!location.onLocation()) {
                    System.out.println("GAME OVER");
                    break;
                }
            }
        }
    }
}
