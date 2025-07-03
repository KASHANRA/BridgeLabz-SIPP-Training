package level_1;

import java.util.*;

public class SplitTheText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();
        String[] words = splitTextIntoWords(input);
        String[][] result = generateWordLengthTable(words);

        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");
        for (int i = 0; i < result.length; i++) {
            String word = result[i][0];
            int length = Integer.parseInt(result[i][1]);
            System.out.println(word + "\t\t" + length);
        }
    }

    public static String[] splitTextIntoWords(String text) {
        ArrayList<String> wordsList = new ArrayList<>();
        String word = "";

        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    wordsList.add(word);
                    word = "";
                }
            }
        }

        if (!word.equals("")) {
            wordsList.add(word);
        }

        String[] words = new String[wordsList.size()];
        for (int i = 0; i < wordsList.size(); i++) {
            words[i] = wordsList.get(i);
        }
        return words;
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[][] generateWordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }
}
