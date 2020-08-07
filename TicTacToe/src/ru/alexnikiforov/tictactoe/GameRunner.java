package ru.alexnikiforov.tictactoe;

import java.util.Scanner;

public class GameRunner {

    public static void main(String[] args) {
        Field f = new Field();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("-----TIC-TAC-TOE-----");

        System.out.println("You should mark any free space with 0 or X");
        System.out.println("1 | 2 | 3");
        System.out.println("4 | 5 | 6");
        System.out.println("7 | 8 | 9");
        System.out.println("Choose a space - type a number from 1 to 9:");
        f.setSpaceNumber (scanner.nextInt());
        System.out.println("Type 0 or X for this space:\n ");
        f.setMark(scanner2.nextLine());
        System.out.println(f.toString());




    }
}
