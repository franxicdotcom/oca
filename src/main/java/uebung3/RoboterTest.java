package uebung3;

import java.util.Scanner;

public class RoboterTest {
    public static void main(String[] args) {
        Roboter r = new Roboter();
        r.printField();

        while (true){
            System.out.println("Bitte geben Sie eine Anweisung oder exit ein!");

            Scanner s = new Scanner(System.in);

            String action = s.nextLine().trim().toLowerCase();
            if (action.equals("exit")) break;

            r.stringToAction(action);
        }
    }
}
