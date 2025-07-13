package level_1;
public class BubbleSort {
    public static void main(String[] args) {
        int[] marks = {85, 42, 75, 96, 58, 73, 60};
        bubbleSort(marks);
        System.out.println("Sorted marks:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
