package ru.alexnikiforov.tictactoe;

public class GameRunner {

    public static void main(String[] args) {
        GameLogic.intro();

        while (!GameLogic.getGameOver()) {
            GameLogic.playersMove();
            GameLogic.show();
            GameLogic.gameOver();
            GameLogic.computersMove();
            GameLogic.show();
            GameLogic.gameOver();
        }
        GameLogic.showWinnerName();

        //компьютер перезатирает ходы игрока. нужно найти баг










    }
}
