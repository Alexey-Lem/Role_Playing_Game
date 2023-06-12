public class Monster extends Personage {

    public Monster() {
        int n = (int) (Math.random()*100) +1;
        this.name = n <= 50 ? "Goblin" : "Skelet";
        this.agility = (int) (Math.random() * 100)+1;
        this.health = (int) (Math.random() * 100)+1;
        this.power = (int) (Math.random() * 100)+1;
        System.out.println("В лесу встретился монстр "+ this.name+
                            ", Ловкость: "+ this.agility +
                            ", Здоровье: "+ this.health +
                            ", Сила: " + this.power);
    }
    public void setHealth(int h) {
        this.health += h;
    }
    public void setAgility(int a) {
        this.agility += a;
    }
    public void setPower(int p) {
        this.power += p;
    }
}
