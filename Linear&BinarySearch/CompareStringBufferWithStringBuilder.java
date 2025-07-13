package level_1;
public class CompareStringBufferWithStringBuilder {
    public static void main(String[] args) {
        int n = 1_000_000;
        String toAppend = "hello";
        long startTimeBuffer = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(toAppend);
        }
        long endTimeBuffer = System.nanoTime();
        long startTimeBuilder = System.nanoTime();
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sBuilder.append(toAppend);
        }
        long endTimeBuilder = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTimeBuffer - startTimeBuffer) / 1_000_000 + " ms");
        System.out.println("Time taken by StringBuilder: " + (endTimeBuilder - startTimeBuilder) / 1_000_000 + " ms");
    }
}
