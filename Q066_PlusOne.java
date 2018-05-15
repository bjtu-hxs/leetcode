import java.util.ArrayList;

public class Q066_PlusOne {
    public int[] plusOne(int[] digits) {
//        int length = digits.length;
//        long num = 0;
//        int index = 0;
//        while (--length >= 0) {
//            num += digits[index++] * Math.pow(10, length);
//        }
//        num++;
//
//        int[] tmp = new int[digits.length + 1];
//        int len = 0;
//        while (num > 0) {
//            tmp[len++] = (int) (num % 10);
//            num /= 10;
//        }
//
//        int[] result = new int[len];
//        int pos = len - 1;
//        for (int i = 0; i < len; i++) {
//            result[i] = tmp[pos--];
//        }
//
//        return result;

//        // Method_01  0ms  100%
//        int carry = 1;
//        int n = digits.length;
//        for (int i = n - 1; i >= 0; i--) {
//            int tmp = digits[i] + carry;
//            digits[i] = tmp % 10;
//            carry = tmp / 10;
//        }
//
//        // special case 9999999999...
//        if (carry == 1) {
//            int[] res = new int[n + 1];
//            res[0] = 1;
//            return res;
//        }
//
//        return digits;

        // Method_02  0ms  100%
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // special case 999999....
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;

    }
}
