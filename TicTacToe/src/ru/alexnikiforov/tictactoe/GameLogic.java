package ru.alexnikiforov.tictactoe;

import java.util.Scanner;

public class GameLogic {
    static int spaceNumber;
    static String mark;

    static Field f = new Field();
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner2 = new Scanner(System.in);

    public static void intro()    {
        System.out.println("-----TIC-TAC-TOE-----");
        System.out.println("These are the spaces numbers: ");
        System.out.println("1 | 2 | 3");
        System.out.println("4 | 5 | 6");
        System.out.println("7 | 8 | 9");
      //  System.out.println("You should mark any free space with 0 or X: ");
    }

    public static void chooseSpace () {
        do {
            System.out.println("Choose a space - type a number from 1 to 9:");
            spaceNumber = scanner.nextInt();
            f.setSpaceNumber(spaceNumber);

        } while (spaceNumber < 1 || spaceNumber > 9);

    }

    public static void markSpaceWithXor0 () {
        do {
            System.out.println("Type 0 or X for this space:\n ");
            mark = scanner2.nextLine();
            f.setMark(mark);
        } while (!mark.equals("X") /*|| !mark.equals("x") || !mark.equals("0") || !mark.equals("o") || !mark.equals("O")*/);
    }

    public static void show () {
        f.showField();
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
