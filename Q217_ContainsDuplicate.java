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

//        HashSet<Integer> hashset=new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            hashset.add(nums[i]);
//        }
//        return hashset.size() != nums.length;

        if(nums == null || nums.length == 1) return false;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }

        boolean[] bool = new boolean[max - min + 1];  // 空间要求大
        for(int num : nums){
            if(bool[num - min])
                return true;
            else
                bool[num - min] = true;
        }

        return false;
    }


}
