package ru.alexnikiforov.tictactoe;

public class Field {
    int spaceNumber;
    String space1 = " ";
    String space2 = " ";
    String space3 = " ";
    String space4 = " ";
    String space5 = " ";
    String space6 = " ";
    String space7 = " ";
    String space8 = " ";
    String space9 = " ";


//SpaceState space2 = SpaceState.EMPTY;
//SpaceState space3 = SpaceState.EMPTY;
//SpaceState space4 = SpaceState.EMPTY;
//SpaceState space5 = SpaceState.EMPTY;
//SpaceState space6 = SpaceState.EMPTY;
//SpaceState space7 = SpaceState.EMPTY;
//SpaceState space8 = SpaceState.EMPTY;
//SpaceState space9 = SpaceState.EMPTY;

    public int setSpaceNumber(int spaceNumber) {
        if (spaceNumber > 0 && spaceNumber < 10) {
            this.spaceNumber = spaceNumber;
        } else
            System.out.println("Invalid value!");
        return spaceNumber;

    }



    public void setMark(String mark) {
        if (spaceNumber == 1) {
            space1 = mark;
        } else if (spaceNumber == 2) {
            space2 = mark;
        }
        else if (spaceNumber == 3) {
            space3 = mark;
        }else if (spaceNumber == 4) {
            space4 = mark;
        }else if (spaceNumber == 5) {
            space5 = mark;
        }
        else if (spaceNumber == 6) {
            space6 = mark;
        }else if (spaceNumber == 7) {
            space7 = mark;
        }else if (spaceNumber == 8) {
            space8 = mark;
        } else if (spaceNumber == 9) {
            space9 = mark;
        }


    }

    public  boolean checkIfSpaceIsFree (int spaceNumber) {
        boolean spaceIsFree = false;
        if (spaceNumber == 1) {
            if (space1 == " ")
                spaceIsFree = true;
            else
                spaceIsFree = false;
        } else if (spaceNumber == 2) {
            if (space2 == " ")
                spaceIsFree = true;
            else
                spaceIsFree = false;
        } else if (spaceNumber == 3) {
            if (space3 == " ")
                spaceIsFree = true;
            else
                spaceIsFree = false;
        } else if (spaceNumber == 4) {
            if (space4 == " ")
                spaceIsFree = true;
            else
                spaceIsFree = false;
        } else if (spaceNumber == 5) {
            if (space5 == " ")
                spaceIsFree = true;
            else
                spaceIsFree = false;
        } else if (spaceNumber == 6) {
            if (space6 == " ")
                spaceIsFree = true;
            else
                spaceIsFree = false;
        } else if (spaceNumber == 7) {
            if (space7 == " ")
                spaceIsFree = true;
            else
                spaceIsFree = false;
        } else if (spaceNumber == 8) {
            if (space8 == " ")
                spaceIsFree = true;
            else
                spaceIsFree = false;
        } else if (spaceNumber == 9) {
            if (space9 == " ")
                spaceIsFree = true;
            else
                spaceIsFree = false;
        }
        return spaceIsFree;
    }


    public String getSpace1() {
        return space1;
    }

    public String getSpace2() {
        return space2;
    }

    public String getSpace3() {
        return space3;
    }

    public String getSpace4() {
        return space4;
    }

    public String getSpace5() {
        return space5;
    }

    public String getSpace6() {
        return space6;
    }

    public String getSpace7() {
        return space7;
    }

    public String getSpace8() {
        return space8;
    }

    public String getSpace9() {
        return space9;
    }

    public void showField() {
        System.out.println(space1 + " | " + space2 + " | " + space3);
        System.out.println("---------");
        System.out.println(space4 + " | " + space5 + " | " + space6);
        System.out.println("---------");
        System.out.println(space7 + " | " + space8 + " | " + space9);







        }
    }

