package words;

import java.util.ArrayList;

public class GameLogic {
    private ArrayList<String> listOfWords;

    public void setListOfWords(ArrayList<String> listOfWords) {
        this.listOfWords = listOfWords;
    }

    public ArrayList<String> getListOfWords() {
        return listOfWords;
    }

    public boolean isValidWord(String s) throws ReceiveIncorrectLetter {
        if (isWordConsistOfLetters(s)) {
            return false;
        }
        if (isWordContainRepeatedWords(s)) {
            return false;
        }
        return isWordBeginWithRightLetter(s);
    }

    public boolean isWordConsistOfLetters(String s) throws ReceiveIncorrectLetter {
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if(aChar=='ь'||aChar=='ъ'){
                throw new ReceiveIncorrectLetter("This word ends on incorrect letter");
            }

            if (!Character.isLetter(aChar)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWordContainRepeatedWords(String s) {
        if (!listOfWords.isEmpty()) {
            return listOfWords.contains(s);
        }
        return false;
    }

    public boolean isWordBeginWithRightLetter(String s) {
        if (!listOfWords.isEmpty()) {
            char lastLetterOfLastWord = (listOfWords.get(listOfWords.size() - 1).charAt((listOfWords.get(listOfWords.size() - 1)).length() - 1));
            return s.charAt(0) == lastLetterOfLastWord;
        }
        return true;
    }
}