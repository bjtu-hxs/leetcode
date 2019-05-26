public class Q283_MoveZeroes {
    public void moveZeroes(int[] nums) {
//        // Method_01  2ms  100%
//        int number = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                number++;
//            } else {
//                nums[i - number] = nums[i];
//            }
//        }
//        for (int i = nums.length - 1; i >= nums.length - number; i--) {
//            nums[i] = 0;
//        }

        // Method_02
        int pos = 0;
        for (int num :
                nums) {
            if (num != 0) {
                nums[pos++] = num;
            }
        }
        while (pos < nums.length) {
            nums[pos] = 0;
        }
    }
}
