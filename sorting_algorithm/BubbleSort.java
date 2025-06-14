package sorting_algorithm;

public class BubbleSort {
    public static void main(String[] args) {

        int nums[] = { 6, 5, 2, 8, 9, 4 };

        System.out.println("before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("after sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
