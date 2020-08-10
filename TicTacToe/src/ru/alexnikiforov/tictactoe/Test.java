package ru.alexnikiforov.tictactoe;
public class Test {


    public static void main(String[] args) {

        isSpaceFree(1);

    }
    static String space1 = " ";


    public static boolean isSpaceFree(int spaceNumber) {
        boolean spaceIsFree = false;
        if (spaceNumber == 1) {
            if (space1 == " ")
                spaceIsFree = true;
            else
                spaceIsFree = false;
        }
        return spaceIsFree;
    }
}



