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
            space8 = mark;
        }


    }

    public void showField() {
        System.out.println(space1 + " | " + space2 + " | " + space3);
        System.out.println("---------");
        System.out.println(space4 + " | " + space5 + " | " + space6);
        System.out.println("---------");
        System.out.println(space7 + " | " + space8 + " | " + space9);
    }

}