package words_against_computer.words;

public class Main {
    public static void main(String[] args)throws ReceiveIncorrectLetter {
        GameLogic gameLogic= new GameLogic();
        PlayerUI playerUI = new PlayerUI(gameLogic);
        playerUI.start();
    }
}
