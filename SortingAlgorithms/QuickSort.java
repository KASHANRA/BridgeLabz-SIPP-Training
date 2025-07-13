package level_1;
public class QuickSort {
    public static void main(String[] args) {
        double[] prices = {29.99, 9.99, 15.75, 4.99, 49.50, 19.95};
        quickSort(prices, 0, prices.length - 1);
        System.out.println("Sorted product prices:");
        for (double price : prices) {
            System.out.print(price + " ");
        }
    }

    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(double[] arr, int low, int high) {
        double pivot = arr[high]; 
        int i = low - 1; 
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;       
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
