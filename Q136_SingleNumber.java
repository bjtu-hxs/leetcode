import java.util.Arrays;

public class Q136_SingleNumber {
    public int singleNumber(int[] nums) {
//        // Method_01
//        Arrays.sort(nums);
//        for (int i :
//                nums) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 1; i < nums.length; i += 2) {
//            System.out.println(nums[i] + " " + nums[i - 1]);
//            if (nums[i] != nums[i - 1]) {
//                return nums[i - 1];
//            }
//        }
//        return nums[nums.length - 1];

        // Method_02
        int result = 0;
        for (int i :
                nums) {
            result ^= i;
        }
        return result;
    }
}
