public class Q012_IntegerToRoman {
//    // Method 1 92ms 69.58%
//    public String intToRoman(int num) {
//        String res = "";
//        int dimention = 1000;
//
//        while (dimention != 0) {
//            int cur = num/dimention;
//            if (cur != 0) {
//                if (cur < 4) {
//                    for (int i = 0; i < cur; i++) {
//                        res += getCharArray(dimention)[0];
//                    }
//                }else if (cur == 4) {
//                    res += getCharArray(dimention)[0] + getCharArray(dimention)[1];
//                }else if (cur >= 5 && cur < 9){
//                    res += getCharArray(dimention)[1];
//                    cur -= 5;
//                    for (int i = 0; i < cur; i++) {
//                        res += getCharArray(dimention)[0];
//                    }
//                } else {
//                        res += getCharArray(dimention)[0] + getCharArray(dimention)[2];
//                }
//            }
//            num %= dimention;
//            dimention /= 10;
//        }
//
//        return res;
//    }
//
//    public String[] getCharArray(int dimention) {
//        if (dimention == 1000) {
//            return new String[]{"M", "", ""};
//        } else if (dimention == 100) {
//            return new String[]{"C", "D", "M"};
//        } else if (dimention == 10) {
//            return new String[]{"X", "L", "C"};
//        } else {
//            return new String[]{"I", "V", "X"};
//        }
//    }

    // Method 2 45ms 98.87%
    public String intToRoman(int num) {
        int[] dimentions = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strings = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < dimentions.length; i++) {
            while (num >= dimentions[i]) {
                num -= dimentions[i];
                res.append(strings[i]);
            }
        }
        return res.toString();
    }
}
