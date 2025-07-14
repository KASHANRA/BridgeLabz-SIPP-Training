package level_1;
import java.util.Arrays;
import java.util.Random;
public class SortingLargeDataEfficiently {
    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10000, 1000000};
        for (int size : datasetSizes) {
            System.out.println("Dataset size: " + size);
            int[] dataset = generateRandomDataset(size);
            long startTime = System.nanoTime();
            bubbleSort(dataset.clone());
            long endTime = System.nanoTime();
            System.out.println("Bubble Sort took: " + (endTime - startTime) / 1000000 + " ms");
            startTime = System.nanoTime();
            mergeSort(dataset.clone());
            endTime = System.nanoTime();
            System.out.println("Merge Sort took: " + (endTime - startTime) / 1000000 + " ms");
            startTime = System.nanoTime();
            quickSort(dataset.clone(), 0, dataset.length - 1);
            endTime = System.nanoTime();
            System.out.println("Quick Sort took: " + (endTime - startTime) / 1000000 + " ms");           
            System.out.println();
        }
    }

    public static void bubbleSort(int[] dataset) {
        int n = dataset.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (dataset[j] > dataset[j + 1]) {
                    int temp = dataset[j];
                    dataset[j] = dataset[j + 1];
                    dataset[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] dataset) {
        if (dataset.length < 2) return;
        int mid = dataset.length / 2;
        int[] left = Arrays.copyOfRange(dataset, 0, mid);
        int[] right = Arrays.copyOfRange(dataset, mid, dataset.length);
        mergeSort(left);
        mergeSort(right);
        merge(dataset, left, right);
    }

    private static void merge(int[] dataset, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                dataset[k++] = left[i++];
            } else {
                dataset[k++] = right[j++];
            }
        }
        while (i < left.length) {
            dataset[k++] = left[i++];
        }
        while (j < right.length) {
            dataset[k++] = right[j++];
        }
    }

    public static void quickSort(int[] dataset, int low, int high) {
        if (low < high) {
            int pi = partition(dataset, low, high);
            quickSort(dataset, low, pi - 1);
            quickSort(dataset, pi + 1, high);
        }
    }

    private static int partition(int[] dataset, int low, int high) {
        int pivot = dataset[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (dataset[j] < pivot) {
                i++;
                int temp = dataset[i];
                dataset[i] = dataset[j];
                dataset[j] = temp;
            }
        }
        int temp = dataset[i + 1];
        dataset[i + 1] = dataset[high];
        dataset[high] = temp;
        return i + 1;
    }

    public static int[] generateRandomDataset(int size) {
        Random rand = new Random();
        int[] dataset = new int[size];
        for (int i = 0; i < size; i++) {
            dataset[i] = rand.nextInt(100000);
        }
        return dataset;
    }
}
