package words_against_computer.words;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerUI {
    private final GameLogic gameLogic;

    public PlayerUI(GameLogic gameLogic) {
        this.gameLogic = gameLogic;
    }

    public void start() throws ReceiveIncorrectLetter {
        Scanner in = new Scanner(System.in);
        printMainMenu(in);
    }

    private void printMainMenu(Scanner in) throws ReceiveIncorrectLetter {

        boolean running = true;

        while (running) {

            System.out.println("Hello, indicate your choice:");
            System.out.println("1) Start game.");
            System.out.println("2) Exit.");

            int choice = in.nextInt();


            if (choice <= 0 || choice > 2) {
                System.out.println("Digit should be from 1 to 2");
            }

            switch (choice) {
                case 1:
                    printGame(in);
                    break;
                case 2:
                    running = false;
                    break;
            }
        }
    }

    private void printGame(Scanner in) throws ReceiveIncorrectLetter {
        gameLogic.setListOfWords(new ArrayList<>());
        System.out.println("To exit the game, press (0)");
        while (true) {
            System.out.println("Player1, write your word!");
            getWord(in);

            System.out.println("Player2, write your word!");
            getWord(in);
        }
    }

    private void getWord(Scanner in) throws ReceiveIncorrectLetter {

        try {
            String s = getNewWord(in);

            boolean resultOfValidation = gameLogic.isValidWord(s);

            while (!resultOfValidation) {

                if (gameLogic.isWordConsistOfLetters(s)) {
                    System.out.println("The word must consist of letters!");
                }

                if (!gameLogic.isWordBeginWithRightLetter(s)) {
                    System.out.println("The word should begin with the letter, the previous word ends!");
                }

                if (gameLogic.isWordContainRepeatedWords(s)) {
                    System.out.println("the words must not be repeated!");
                }

                s = getNewWord(in);
                resultOfValidation = gameLogic.isValidWord(s);

            }
            gameLogic.getListOfWords().add(s);
            System.out.println("Used words:");
            System.out.println(gameLogic.getListOfWords());

        } catch (ReceiveIncorrectLetter e) {
            System.out.println("This word ends on incorrect letter, you should enter new word!");
            getWord(in);
        }
    }

    private static void stopGameIfOIsPressed(String s) {
        if (s.equals("0")) {
            System.exit(0);
        }
    }

    private String getNewWord(Scanner in) {
        String s = in.next();
        stopGameIfOIsPressed(s);
        return s.toLowerCase();
    }
}