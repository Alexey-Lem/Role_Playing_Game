import java.util.Scanner;

public class Menu {
    public static int mn = 0;
    public boolean check = true;
    public static int dcheck, bcheck;
    public static int menu() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Куда вы хотите пойти? ");
        System.out.println("1. К торговцу");
        System.out.println("2. В тёмный лес");
        System.out.println("3. На выход");
        while (true) {

            if (sc.hasNextInt()) {
                Menu.mn = sc.nextInt();
                return Menu.mn;
            } else {
                System.out.println("Введите цифру [ 1, 2, 3 ]");
                sc.next();
                continue;
            }
        }
    }
    public static void gameChoice(int mn) throws InterruptedException {
        switch (mn) {
            case 1:
                Dealer.byHealth(Game.hr);
                break;
            case 2:
                System.out.println("Идем в лес");
                Monster mr = new Monster();
                Battle b1 = new Battle(Game.hr, mr);
                b1.start();
                Thread.sleep(500);
                int result = Battle.result;
//                int result = Battle.goBattle(Game.hr, mr);
                if (result == 1) Menu.dmenu();
                break;
            case 3:
                System.out.println("Конец игрыGame.");
                break;
        }
    }

    public static void setDcheck(int dcheck) {
        Menu.dcheck = dcheck;
    }

    public static void setBcheck(int bcheck) {
        Menu.bcheck = bcheck;
    }

    public static void dmenu() throws InterruptedException {
        int dn = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Вернутся в город ");
        System.out.println("2. Продолжить торговлю / бой");
        while (true) {
            if (sc.hasNextInt()) {
                dn = sc.nextInt();
                break;
            } else {
                System.out.println("Введите цифру [ 1, 2 ]");
                sc.next();
                continue;
            }

        }
        switch (dn) {
            case 1:
                Game.gameMenu();
                break;
            case 2:
                System.out.println("Продолжаем торговлю / бой ");
                if (dcheck == 1 && bcheck == 0) {
                    Dealer.byHealth(Game.hr);
                }else if (dcheck == 0 && bcheck == 1){
                    Monster mr = new Monster();
                    Battle b1 = new Battle(Game.hr, mr);
                    b1.start();
                    Thread.sleep(500);
//                    Battle.goBattle(Game.hr, mr);
                    if (Game.hr.health > 0) dmenu();
                }
                break;
        }
    }
}
