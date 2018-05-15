public class Q070_ClimbingStairs {
    //    // Method_01
//    public int climbStairs(int n) {
//        return fibonacci(n);
//    }
//
//    public static int fibonacci(int n) {
//        if (n == 1 || n == 2) {
//            return 1;
//        } else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
//    }

    // Method_02
    public int climbStairs(int n) {
        int f0 = 1;
        int f1 = 1;
        for (int i = 1; i < n; i++) {
            int f = f1;
            f1 += f0;
            f0 = f;
        }
        return f1;
    }
}
