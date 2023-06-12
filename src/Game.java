import java.util.Scanner;

public class Game {
    public static Hero hr;

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Создаем героя, дайте ему имя :");
        String str = sc.nextLine();
        hr = new Hero(str);
        gameMenu();
    }

    public static void gameMenu() throws InterruptedException {
        Menu.menu();
        Menu.gameChoice(Menu.mn);
    }


}