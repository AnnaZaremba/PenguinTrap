package penguintrap;

import java.util.Scanner;

public class Worker {
    public static void main(String[] args) {
        PenguinTrap penguinTrap = new PenguinTrap();

        Scanner enter = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("Wciśnij ENTER");
            enter.nextLine();
            System.out.println("Wynik: " + penguinTrap.getWynik());
        }
    }
}
