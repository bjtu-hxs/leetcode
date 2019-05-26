class VersionControl {
    public boolean isBadVersion(int version) {
        return false;
    }
}

public class Q278_FirstBadVersion extends VersionControl {
//    // Method_01  15ms  94.57%
//    public int firstBadVersion(int n) {
//        return binarySearch(1, n);  // 递归调用
//    }
//
//    private int binarySearch(int start, int end) {
//        if (end - start <= 1) {  //  递归结束条件
//            if (isBadVersion(start)) {
//                return start;
//            } else {
//                return end;
//            }
//        }
//
//        int index = (int)(((long)start + (long)end) / 2);  // 二分查找
//        if (isBadVersion(index)) {
//            return binarySearch(start, index);
//        } else {
//            return binarySearch(index + 1, end);
//        }
//    }

    // Method_01  14ms  100.00%
    public int firstBadVersion(int n) {
        if (n == 1) { // 边界判断
            return 1;
        }
        int left = 1;
        int right = n;
        while (right > left) {
            int mid = left + (right - left) / 2;  //二分查找，防止溢出
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
