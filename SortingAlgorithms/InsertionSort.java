package level_1;
public class InsertionSort {
    public static void main(String[] args) {
        int[] employeeIDs = {105, 23, 67, 34, 89, 12, 78};
        insertionSort(employeeIDs);
        System.out.println("Sorted Employee IDs:");
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
