import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q350_IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
//        // Method_01  6ms  61.49%
//        HashMap<Integer, Integer> numMap = new HashMap<>();
//        ArrayList<Integer> numList = new ArrayList<>();
//
//        for (int i :
//                nums1) {
//            numMap.put(i, (numMap.get(i) == null ? 0 : numMap.get(i)) + 1);
//        }
//
//        for (int i :
//                nums2) {
//            if (numMap.get(i) != null && numMap.get(i) > 0) {
//                numMap.put(i, numMap.get(i) - 1);
//                numList.add(i);
//            }
//        }
//
//        int[] result = new int[numList.size()];
//        int index = 0;
//        for (int i :
//                numList) {
//            result[index++] = i;
//        }
//        return result;

//        // Method_02  5ms  77.02%
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int index1 = 0, index2 = 0;
//        ArrayList<Integer> numList = new ArrayList<>();
//        while (index1 < nums1.length && index2 < nums2.length) {
//            if (nums1[index1] == nums2[index2]) {
//                numList.add(nums1[index1++]);
//                index2++;
//            } else if (nums1[index1] > nums2[index2]) {
//                index2++;
//            } else if (nums1[index1] < nums2[index2]) {
//                index1++;
//            }
//        }
//
//        int[] result = new int[numList.size()];
//        int index = 0;
//        for (int i :
//                numList) {
//            result[index++] = i;
//        }
//        return result;

        // Method_03  4ms  88.27%
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 = 0, index2 = 0;
        ArrayList<Integer> numList = new ArrayList<>();
        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] == nums2[index2]) {
                numList.add(nums1[index1++]);
                index2++;
            } else if (nums1[index1] > nums2[index2]) {
                index2++;
            } else if (nums1[index1] < nums2[index2]) {
                index1++;
            }
        }

        int[] result = new int[numList.size()];
        int index = 0;
        for (int i :
                numList) {
            result[index++] = i;
        }
        return result;
    }
}
