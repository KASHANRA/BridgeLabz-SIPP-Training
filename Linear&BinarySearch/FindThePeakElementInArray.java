package level_1;
public class FindThePeakElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(arr);
        if (peakIndex != -1) {
            System.out.println("Peak element found at index: " + peakIndex);
            System.out.println("Peak element: " + arr[peakIndex]);
        } else {
            System.out.println("No peak element found.");
        }
    }

    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            boolean leftIsSmaller = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightIsSmaller = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);
            if (leftIsSmaller && rightIsSmaller) {
                return mid;
            }
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
