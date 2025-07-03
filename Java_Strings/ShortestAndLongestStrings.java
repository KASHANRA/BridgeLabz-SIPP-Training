package level_1;
import java.util.*;
public class ShortestAndLongestStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] wordLengths = getWordLengthTable(words);
        int[] minMaxIndexes = findShortestAndLongest(wordLengths);

        System.out.println("\nWords and Lengths:");
        System.out.println("----------------------");
        for (int i = 0; i < wordLengths.length; i++) {
            System.out.println(wordLengths[i][0] + " -> " + wordLengths[i][1]);
        }

        System.out.println("\nShortest word: " + wordLengths[minMaxIndexes[0]][0]);
        System.out.println("Longest word: " + wordLengths[minMaxIndexes[1]][0]);
    }

    public static String[] splitWords(String str) {
        ArrayList<String> list = new ArrayList<>();
        String word = "";
        for (int i = 0; i < getLength(str); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    list.add(word);
                    word = "";
                }
            }
        }
        if (!word.equals("")) {
            list.add(word);
        }

        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
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

    public static String[][] getWordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestAndLongest(String[][] wordTable) {
        int minIndex = 0;
        int maxIndex = 0;
        int min = Integer.parseInt(wordTable[0][1]);
        int max = Integer.parseInt(wordTable[0][1]);

        for (int i = 1; i < wordTable.length; i++) {
            int len = Integer.parseInt(wordTable[i][1]);
            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }
}
