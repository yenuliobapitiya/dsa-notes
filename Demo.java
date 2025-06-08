public class Demo {
    public static void main(String[] args) {
        
        //create an array of integers
        int nums[] = {5, 7, 9, 11, 13};
        int target = 11; //element to search for

        //call the linearSearch method
        //and store the result
        int result = linearSearch(nums, target);

        //print the result
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
        System.out.println("Element not found");

    }

    //linearSearch method
    //returns the index of the target if found, otherwise returns -1
    public static int linearSearch(int[] nums, int target){

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; // return the index if found
            }
        }
        return -1;
    }
    
}
