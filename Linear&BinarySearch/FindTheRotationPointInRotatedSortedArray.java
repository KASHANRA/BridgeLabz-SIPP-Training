package level_1;
public class FindTheRotationPointInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {15, 18, 2, 3, 6, 12}; // Rotated sorted array
        int rotationIndex = findRotationPoint(nums);
        System.out.println("Rotation point (index of smallest element): " + rotationIndex);
        System.out.println("Smallest element: " + nums[rotationIndex]);
    }

    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }
}
