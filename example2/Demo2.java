package example2;

public class Demo2 {
    public static void main(String[] args) {

        // create an array of integers
        int nums[] = { 1, 2, 3, 5, 7, 9, 11, 13 };
        int target = 11; // element to search for

        // call the linearSearch method
        // and store the result
        int result1 = linearSearch(nums, target);

        int result2 = binarySearch(nums, target);

        // print the result
        if (result1 != -1)
            System.out.println("Element found at index: " + result1);
        else
            System.out.println("Element not found");

    }

    // linearSearch method
    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken by Linear : " + steps);
                return i; // return the index if found
            }
        }
        System.out.println("Steps taken by Linear : " + steps);
        return -1;
    }

    // binarySearch method
    public static int binarySearch(int[] nums, int target) {
        // 5,7,9,11,13
        int steps = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                System.out.println("Steps taken by Binary : " + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        System.out.println("Steps taken by Binary : " + steps);
        return -1;
    }

}

// in here i tried some
