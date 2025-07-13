package level_1;
import java.util.*;
public class FindAllSubarraysWithZeroSum {
    public static void main(String[] args) {
        int[] nums = {3, 4, -7, 1, 3, 3, 1, -4};
        List<int[]> subarrays = findZeroSumSubarrays(nums);
        for (int[] sub : subarrays) {
            System.out.println("Subarray found from index " + sub[0] + " to " + sub[1]);
        }
    }

    public static List<int[]> findZeroSumSubarrays(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
        return result;
    }
}
