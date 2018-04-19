import java.util.Arrays;
import java.util.HashSet;

public class Q217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == nums[i - 1]) {
//                return true;
//            }
//        }
//        return false;

        HashSet<Integer> hashset=new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            hashset.add(nums[i]);
        }
        return hashset.size() != nums.length;
    }
}
