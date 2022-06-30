public class ToolStore extends NormalLocation {

    public ToolStore(Player player) {
        super(player, "Magaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("------Magazaya Hosgeldiniz!------");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zirhlar");
            System.out.println("3 - Cikis yap");
            System.out.println("Seciminiz: ");
            int selection = input.nextInt();

            while (selection < 1 || selection > 3) {
                System.out.print("Gecerli Secim yapin !");
                selection = input.nextInt();
            }
            switch (selection) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Bir daha bekleriz..");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("-----Silahlar-----");
        for (Weapon weapon : Weapon.weapons()) {
            System.out.println("ID: " + weapon.getId() +
                    "\tSilah: " + weapon.getName() +
                    "\tHasar: " + weapon.getDamage() +
                    "\tDegeri: " + weapon.getPrice());
        }
        System.out.println("0- Cikis yap: ");

    }

    public void buyWeapon() {
        System.out.println("Bir silah secin: ");
        int selectionWeapon = input.nextInt();
        while (selectionWeapon < -1 || selectionWeapon > 3) {
            System.out.println("Gecerli deger girin !!");
            selectionWeapon=input.nextInt();
        }
        if (selectionWeapon != 0) {

            Weapon selectedWeapon = Weapon.getWeaponObjById(selectionWeapon);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeteri paraniz bulunmamaktadir!");

                } else {
                    System.out.println(selectedWeapon.getName() + " Silahi " + selectedWeapon.getPrice() + " para Karsiliginda satin alindi ! ");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan para: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);

                }
            }

        }


    }

    public void printArmor() {

        System.out.println("-------------ZIRHLAR-------------");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + " - " + a.getName() +
                    "\tZirh: " + a.getBlock() + "\tPara: " + a.getPrice());
        }
        System.out.println("0- Cikis yap: ");
        System.out.println("---------------------------------");
    }

    public void buyArmor() {
        System.out.println("Bir zirh secin: ");
        int selectArmorId = input.nextInt();
        while (selectArmorId < 0 || selectArmorId > 3) {
            System.out.println("Gecerli deger girin !!");
            selectArmorId = input.nextInt();
        }
        if(selectArmorId!=0) {
            Armor selectedArmor = Armor.getArmorById(selectArmorId);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeteri paraniz bulunmamaktadir!");

                } else {
                    System.out.println(selectedArmor.getName() + " Zirhi " + selectedArmor.getPrice() + " para Karsiliginda satin alindi ! ");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan para: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);

                }
            }
        }

    }
}
