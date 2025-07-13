package level_1;
public class SearchForSpecificWordInListOfSentences {
    public static void main(String[] args) {
        String[] sentences = {
            "Java is a popular programming language.",
            "It is widely used in enterprise applications.",
            "Python is known for simplicity.",
            "Machine learning is fascinating."
        };
        String targetWord = "Python";
        String result = findSentenceWithWord(sentences, targetWord);
        System.out.println("Result: " + result);
    }

    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;
            }
        }
        return "Not Found";
    }
}
