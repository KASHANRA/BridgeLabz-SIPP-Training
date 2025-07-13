package level_1;
import java.util.*;
public class CheckForPairWithGivenSumInArray {
    public static void main(String[] args) {
        int[] nums = {8, 4, 1, 6};
        int target = 10;
        boolean exists = hasPairWithSum(nums, target);
        System.out.println("Pair with given sum exists: " + exists); // Output: true
    }

    public static boolean hasPairWithSum(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(target - num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
