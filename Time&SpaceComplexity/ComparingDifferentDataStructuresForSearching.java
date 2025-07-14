package level_1;
import java.util.*;
public class ComparingDifferentDataStructuresForSearching {
    public static void main(String[] args) {
        int[] sizes = {1000, 100000, 1000000};
        for (int size : sizes) {
            System.out.println("Dataset Size: " + size);
            int target = size / 2;          
            long startTime = System.nanoTime();
            arraySearch(size, target);
            long endTime = System.nanoTime();
            System.out.println("Array Search time: " + (endTime - startTime) / 1000000 + " ms");
            startTime = System.nanoTime();
            hashSetSearch(size, target);
            endTime = System.nanoTime();
            System.out.println("HashSet Search time: " + (endTime - startTime) / 1000000 + " ms");
            startTime = System.nanoTime();
            treeSetSearch(size, target);
            endTime = System.nanoTime();
            System.out.println("TreeSet Search time: " + (endTime - startTime) / 1000000 + " ms");
            System.out.println();
        }
    }

    public static void arraySearch(int size, int target) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                break;
            }
        }
    }

    public static void hashSetSearch(int size, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(i);
        }
        set.contains(target);
    }

    public static void treeSetSearch(int size, int target) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < size; i++) {
            set.add(i);
        }
        set.contains(target);
    }
}
