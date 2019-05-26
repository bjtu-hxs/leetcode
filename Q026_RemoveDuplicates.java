public class Q026_RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        // Method_01
        int start = 0;
        for (int end = 1; end < nums.length; end++) {
            if (nums[start] != nums[end]) {
                nums[++start] = nums[end];
            }
        }
        return start + 1;

        /*
        // Method_02
        int start = 0;
        for (int end = 1; end < nums.length; end++)
            if (nums[start] != nums[end])
                nums[++start] = nums[end];
        return start + 1;
        */
    }
}
