import java.util.Arrays;

public class Q384_ShuffleAnArray {

    private int[] array;

    public Q384_ShuffleAnArray(int[] nums) {
        array = Arrays.copyOf(nums, nums.length);
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return Arrays.copyOf(array, array.length);
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] res = Arrays.copyOf(array, array.length);
        for (int i = 0; i < res.length; i++) {
            int random = (int) (Math.random()*res.length);
            int tmp = res[random];
            res[random] = res[i];
            res[i] = tmp;
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
