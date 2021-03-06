// 7. Create a function that takes a string and a letter,
// than returns a list that contains all the indexes where the letter occured in the string.

import java.util.ArrayList;

public class FindLetterApp {

    public static void main(String[] args) {
        System.out.println(findIndexes("lepegetopillangolabbal", 'l').toString());
    }

    public static ArrayList<Integer> findIndexes(String text, char letter) {
        ArrayList<Integer> indexes = new ArrayList();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}
