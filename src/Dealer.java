import java.util.Scanner;

public class Dealer {
    public static void noDialer() throws InterruptedException {
        System.out.println("Торговец еще не вышел на работу");
        Menu.dmenu();
    }
    public static void byHealth(Hero hr) throws InterruptedException {
        if ((hr.health + 10) <= 100) {
            hr.health += 10;
            hr.gold -= 5;
            System.out.print("Куплено 10 здоровья за 5 золота. ");
        } else {
            System.out.print("Здоровья достаточно. ");
        }
        System.out.println(hr.name + " -\tHealth: " + hr.health + ", Gold: " + hr.gold);
        Menu.setBcheck(0);
        Menu.setDcheck(1);
        Menu.dmenu();
    }


}
