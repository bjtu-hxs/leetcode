public class Q189_Rotate {
    public void rotate(int[] nums, int k) {
//        // Method_01 132ms
//        k = k % nums.length;
//        while (k-- > 0) {
//            int tmp = nums[nums.length - 1];
//            for (int j = nums.length - 1; j > 0; j--) {
//                nums[j] = nums[j - 1];
//            }
//            nums[0] = tmp;
//        }

        // Method_02 2ms
        k = k % nums.length;
        int[] tmp = new int[k];
        for (int i = 0; i < k; i++) {
            tmp[i] = nums[nums.length - k + i];
        }
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = tmp[i];
        }

        // Method_03

    }
}
