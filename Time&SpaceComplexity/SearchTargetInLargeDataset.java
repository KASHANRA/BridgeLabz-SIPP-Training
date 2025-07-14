package level_1;
import java.util.Arrays;
import java.util.Random;
public class SearchTargetInLargeDataset {
    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10000, 1000000};
        int target = 42;
        for (int size : datasetSizes) {
            System.out.println("Dataset size: " + size);
            int[] dataset = generateRandomDataset(size);
            long startTime = System.nanoTime();
            linearSearch(dataset, target);
            long endTime = System.nanoTime();
            System.out.println("Linear Search took: " + (endTime - startTime) / 1000000 + " ms");
            startTime = System.nanoTime();
            binarySearch(dataset, target);
            endTime = System.nanoTime();
            System.out.println("Binary Search took: " + (endTime - startTime) / 1000000 + " ms");        
            System.out.println();
        }
    }

    public static int linearSearch(int[] dataset, int target) {
        for (int i = 0; i < dataset.length; i++) {
            if (dataset[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] dataset, int target) {
        Arrays.sort(dataset);
        int left = 0, right = dataset.length - 1;        
        while (left <= right) {
            int mid = left + (right - left) / 2;            
            if (dataset[mid] == target) {
                return mid;
            } else if (dataset[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
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
