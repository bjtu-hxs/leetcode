import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q015_3Sum {
    // Method 1 88ms 67.82%
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int left = i + 1;
                int right = nums.length - 1;
                int sum = 0 - nums[i];
                while (left < right) {
                    while (left < right && nums[left] + nums[right] > sum) {
                        while (left < right && nums[right] == nums[--right]);
                    }
                    while (left < right && nums[left] + nums[right] < sum) {
                        while (left < right && nums[left] == nums[++left]);
                    }
                    if (left < right && nums[left] + nums[right] == sum) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[++left]);
                        while (left < right && nums[right] == nums[--right]);
                    }
                }
            }
        }
        return res;
    }


}
