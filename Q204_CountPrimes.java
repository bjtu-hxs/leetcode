public class Q204_CountPrimes {
//    // Method 1 58ms 28.62%
//    public int countPrimes(int n) {
//        if (n == 1 || n == 0 || n == 2) {
//            return 0;
//        }
//        int count = 0;
//        boolean[] flag = new boolean[n];
//        for (int i = 2; i <= (n - 1) / 2; i++) {
//            for (int j = 2; j * i < n; j++) {
//                if (flag[i * j]) {
//                    continue;
//                }
//                flag[i * j] = true;
//                count++;
//            }
//        }
//        return n - count - 2;
//    }

    // Method 2 14ms 95.65%
    public int countPrimes(int n) {
        if (n == 1 || n == 0 || n == 2) {
            return 0;
        }
        int count = n / 2;
        boolean[] flag = new boolean[n];
        for (int i = 3; i * i <= n; i += 2) {
            if (flag[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += i * 2) {
                if (!flag[j]) {
                    count--;
                    flag[j] = true;
                }
            }
        }
        return count;
    }
}
