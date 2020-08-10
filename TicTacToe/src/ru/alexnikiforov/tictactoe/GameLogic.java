package ru.alexnikiforov.tictactoe;

import java.util.Scanner;
import java.util.Random;


public class GameLogic {
    static int spaceNumber;
    static String mark;

    static Field f = new Field();
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner2 = new Scanner(System.in);
    static Random rand = new Random();
    static int whoseMove;
    static boolean gameOver;

    public static void intro()    {
        System.out.println("-----TIC-TAC-TOE-----");
        System.out.println("These are the spaces numbers: ");
        System.out.println("1 | 2 | 3");
        System.out.println("---------");
        System.out.println("4 | 5 | 6");
        System.out.println("---------");
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
        } while (!mark.equals("X") && !mark.equals("x") && !mark.equals("0") && !mark.equals("o") && !mark.equals("O"));
        whoseMove = 0;
    }

    public static int computerIsChoosingSpace () {
        int spaceNumber = Math.round(rand.nextInt(10) +1);
        boolean isSpaceFree = f.checkIfSpaceIsFree(spaceNumber);
        if (!isSpaceFree) {
            while (!isSpaceFree) {
                spaceNumber = Math.round(rand.nextInt(10) +1);
                isSpaceFree = f.checkIfSpaceIsFree(spaceNumber);
            }
        }
        System.out.println(spaceNumber);
        f.setSpaceNumber(spaceNumber);
        return spaceNumber;
    }

    public static void computerMarksSpaceWithXor0 (int spaceNumber) {

            int markIndex = Math.round (rand.nextInt(1));
            if (markIndex == 0) {
                mark = "0";
            } else {
                mark = "X";
            }
            f.setMark(mark);
        System.out.println(mark);
        whoseMove = 1;

    }

    public static void show () {
        f.showField();
    }


    public static boolean gameOver  () {
        if ((f.getSpace1().equals("X") && f.getSpace2().equals("X") && f.getSpace3().equals("X")) ||
            (f.getSpace1().equals("0") && f.getSpace2().equals("0") && f.getSpace3().equals("0")) ||
            (f.getSpace4().equals("X") && f.getSpace5().equals("X") && f.getSpace6().equals("X")) ||
            (f.getSpace4().equals("0") && f.getSpace5().equals("0") && f.getSpace6().equals("0")) ||
            (f.getSpace7().equals("X") && f.getSpace8().equals("X") && f.getSpace9().equals("X")) ||
            (f.getSpace7().equals("0") && f.getSpace8().equals("0") && f.getSpace9().equals("0")) ||
            (f.getSpace1().equals("X") && f.getSpace4().equals("X") && f.getSpace7().equals("X")) ||
            (f.getSpace1().equals("0") && f.getSpace4().equals("0") && f.getSpace7().equals("0")) ||
            (f.getSpace2().equals("X") && f.getSpace5().equals("X") && f.getSpace8().equals("X")) ||
            (f.getSpace2().equals("0") && f.getSpace5().equals("0") && f.getSpace8().equals("0")) ||
            (f.getSpace3().equals("X") && f.getSpace6().equals("X") && f.getSpace9().equals("X")) ||
            (f.getSpace3().equals("0") && f.getSpace6().equals("0") && f.getSpace9().equals("0")) ||
            (f.getSpace1().equals("X") && f.getSpace5().equals("X") && f.getSpace9().equals("X")) ||
            (f.getSpace1().equals("0") && f.getSpace5().equals("0") && f.getSpace9().equals("0")) ||
            (f.getSpace3().equals("X") && f.getSpace5().equals("X") && f.getSpace7().equals("X")) ||
            (f.getSpace3().equals("0") && f.getSpace5().equals("0") && f.getSpace7().equals("0"))) {
            gameOver = true;
        } else {
            gameOver = false;
        }
        return gameOver;
    }

    public static boolean getGameOver() {
        return gameOver;
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
