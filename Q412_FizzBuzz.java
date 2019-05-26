import java.util.ArrayList;
import java.util.List;

public class Q412_FizzBuzz {
//    // Method 1 4ms 69.89%
//    public List<String> fizzBuzz(int n) {
//        List<String> res = new ArrayList<>();
//        String[] strings = {"Fizz", "Buzz", "FizzBuzz"};
//        int a = 0;
//        int b = 0;
//        for (int i = 0; i < n; i++) {
//            a++;
//            b++;
//            String str = a == 3 ? (b == 5 ? strings[2]: strings[0]) : (b == 5 ? strings[1] : String.valueOf(i + 1));
//            res.add(str);
//            if (a == 3) {
//                a = 0;
//            }
//            if (b == 5) {
//                b = 0;
//            }
//        }
//        return res;
//    }


    // Method 2 1ms 100%
    public List<String> fizzBuzz(int n) {
        return new java.util.AbstractList<String>() {
            @Override
            public String get(int index) {
                index++;

                if (index % 3 == 0) {
                    if (index % 5 == 0) {
                        return "FizzBuzz";
                    }
                    return "Fizz";
                }
                if (index % 5 == 0) {
                    return "Buzz";
                }
                return index + "";
            }

            @Override
            public int size() {
                return n;
            }
        };
    }
}
