import java.util.Arrays;

public class Q001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

//        Method_01
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                }
//            }
//        }

//        Method_02
        int[] sortedArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedArray);

        //Find two numbers
        int start = 0, end = sortedArray.length - 1;
        while (start < end) {
            while (sortedArray[start] + sortedArray[end] > target)
                end--;
            if (sortedArray[start] + sortedArray[end] == target)
                break;
            while (sortedArray[start] + sortedArray[end] < target)
                start++;
            if (sortedArray[start] + sortedArray[end] == target)
                break;
        }

        //Find their indices
//        System.out.println(start + " " + end);
        int flag = 0;
        int a = sortedArray[start], b = sortedArray[end];
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == a || nums[i] == b)
                result[flag++] = i;

        return result;
    }
}