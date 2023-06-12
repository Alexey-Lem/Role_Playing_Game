import java.lang.Thread;

public class Battle extends Thread {
    Hero hr;
    Monster mr;
    public static int result;

    public Battle(Hero hr, Monster mr) {
        this.hr = hr;
        this.mr = mr;
    }

    @Override
    public void run() {
        result = goBattle(hr, mr);
    }

    public static int goBattle(Hero hr, Monster mr) {
        int result = 0;

        while (hr.health > 0 && mr.health > 0) {
            double ver = ((double) Math.random() * hr.agility) / 100;
            int hrHit = (int) (hr.power * ver);
            mr.setHealth(-hrHit);
            System.out.println("Герой бъет с силой " + hrHit + ", Здоровье монстра " + mr.health);
            if (mr.health <= 0) {
                hr.setGold(10);
                hr.setExperience(10);
                hr.setAgility(10);
                hr.setPower(10);
                System.out.println(hr.name + " выиграл и получил бонусы ! \n");
                result = 1;

                break;
            }
            int mrHit = (int) (mr.power * (((double) Math.random() * hr.agility) / 100));
            hr.setHealth(-mrHit);
            System.out.println(mr.name + " бъет с силой " + mrHit + ", Здоровье героя " + hr.health);
            if (hr.health <= 0) {
                hr.setExperience(5);
                hr.setAgility(5);
                System.out.println("У героя " + hr.name + " склеились ласты.... ГАМОВЕР ! \n");
                result = 0;
                break;
            }
        }
        Menu.setBcheck(1);
        Menu.setDcheck(0);

        return result;
    }

}
