public class Hero extends Personage{
    public int experience, gold;

    public void setExperience(int e) {
        this.experience += e;
    }

    public void setGold(int g) {
        this.gold += g;
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
    public Hero(String name) {
        this.name = name;
        this.agility = 50;
        this.health = 100;
        this.gold = 20;
        this.experience = 0;
        this.power = 65;
        System.out.println("Герой создан:");
        System.out.println("Имя :\t" + name);
        System.out.println("Ловкость :\t"+ agility);
        System.out.println("Здоровье :\t" + health);
        System.out.println("Золото :\t" + gold);
        System.out.println("Опыт :\t\t" + experience);
        System.out.println("Сила :\t\t" + power + "\n");
    }

}
