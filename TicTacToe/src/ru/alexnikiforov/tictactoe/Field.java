package ru.alexnikiforov.tictactoe;

public class Field {
    int spaceNumber;
    String space1, space2, space3, space4, space5, space6, space7, space8, space9;

//SpaceState space2 = SpaceState.EMPTY;
//SpaceState space3 = SpaceState.EMPTY;
//SpaceState space4 = SpaceState.EMPTY;
//SpaceState space5 = SpaceState.EMPTY;
//SpaceState space6 = SpaceState.EMPTY;
//SpaceState space7 = SpaceState.EMPTY;
//SpaceState space8 = SpaceState.EMPTY;
//SpaceState space9 = SpaceState.EMPTY;

    public int setSpaceNumber(int spaceNumber) {
        this.spaceNumber = spaceNumber;
        return spaceNumber;

    }

    @Override
    public String toString() {
        return "Field{" +
                "spaceNumber=" + spaceNumber +
                ", space1='" + space1 + '\'' +
                ", space2='" + space2 + '\'' +
                ", space3='" + space3 + '\'' +
                ", space4='" + space4 + '\'' +
                ", space5='" + space5 + '\'' +
                ", space6='" + space6 + '\'' +
                ", space7='" + space7 + '\'' +
                ", space8='" + space8 + '\'' +
                ", space9='" + space9 + '\'' +
                '}';
    }

    public void setMark(String y) {
        if (spaceNumber == 1) {
            space1 = y;
        } else if (spaceNumber == 2) {
            space2 = y;
        }
        else if (spaceNumber == 3) {
            space3 = y;
        }else if (spaceNumber == 4) {
            space4 = y;
        }else if (spaceNumber == 5) {
            space5 = y;
        }
        else if (spaceNumber == 6) {
            space6 = y;
        }else if (spaceNumber == 7) {
            space7 = y;
        }else if (spaceNumber == 8) {
            space8 = y;
        } else if (spaceNumber == 8) {
            space8 = y;
        }


    }

}