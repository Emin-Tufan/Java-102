public class SafeHouse extends NormalLocation {

    SafeHouse(Player player) {
        super(player, "Guvenli Alan");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Gunveli evdesiniz !!");
        System.out.println("Caniniz yenillendi");
        this.getPlayer().setHealth(this.getPlayer().getOrjinalHealth());
        return true;

    }
}
