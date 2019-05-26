public class Q852_PeakIndexInAMountainArray {
//    // Method 1 1ms 95.32%
//    public int peakIndexInMountainArray(int[] A) {
//        for (int i = 0; i < A.length - 1; i++) {
//            if(A[i] > A[i + 1]) {
//                return i;
//            }
//        }
//        return A.length-1;
//    }

    // Method 2 0ms 100%
    public int peakIndexInMountainArray(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A[mid] > A[mid - 1] && A[mid + 1] > A[mid]) {
                left = mid + 1;
                if (left == A.length - 1) {
                    return left;
                }
            } else if (A[mid] < A[mid - 1] && A[mid + 1] < A[mid]) {
                right = mid - 1;
                if (right == 0) {
                    return right;
                }
            } else {
                return mid;
            }
        }
        return -1;
    }
}