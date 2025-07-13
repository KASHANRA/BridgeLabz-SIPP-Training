package level_1;
public class SearchForTheFirstNegativeNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 12, -4, 7, -2, 10}; 
        int index = findFirstNegativeIndex(numbers);
        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
            System.out.println("Value: " + numbers[index]);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }

    public static int findFirstNegativeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; 
            }
        }
        return -1;
    }
}
