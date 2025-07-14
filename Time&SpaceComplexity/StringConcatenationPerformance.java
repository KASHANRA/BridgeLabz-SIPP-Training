package level_1;
public class StringConcatenationPerformance {
    public static void main(String[] args) {
        int[] operationsCounts = {1000, 10000, 1000000};
        for (int count : operationsCounts) {
            System.out.println("Operations count: " + count);
            long startTime = System.nanoTime();
            stringConcatenation(count);
            long endTime = System.nanoTime();
            System.out.println("String concatenation took: " + (endTime - startTime) / 1000000 + " ms");
            startTime = System.nanoTime();
            stringBuilderConcatenation(count);
            endTime = System.nanoTime();
            System.out.println("StringBuilder concatenation took: " + (endTime - startTime) / 1000000 + " ms");
            startTime = System.nanoTime();
            stringBufferConcatenation(count);
            endTime = System.nanoTime();
            System.out.println("StringBuffer concatenation took: " + (endTime - startTime) / 1000000 + " ms");
            System.out.println();
        }
    }

    public static void stringConcatenation(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += "a";
        }
    }

    public static void stringBuilderConcatenation(int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append("a");
        }
    }

    public static void stringBufferConcatenation(int count) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < count; i++) {
            result.append("a");
        }
    }
}
