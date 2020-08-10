package ru.alexnikiforov.tictactoe;

public class GameRunner {

    public static void main(String[] args) {
        GameLogic.intro();

        while (!GameLogic.getGameOver()) {
            GameLogic.chooseSpace();
            GameLogic.markSpaceWithXor0();
            GameLogic.show();
            GameLogic.gameOver();
            GameLogic.computerMarksSpaceWithXor0 (GameLogic.computerIsChoosingSpace ());
            GameLogic.show();
            GameLogic.gameOver();
        }








    }
}
