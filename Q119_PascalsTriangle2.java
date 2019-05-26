import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q119_PascalsTriangle2 {
//    // Method 1 3ms 49.37%
//    public List<Integer> getRow(int rowIndex) {
//        List<Integer> res = Arrays.asList(1);
//        if (rowIndex == 0) {
//            return res;
//        }
//        for (int i = 1; i <= rowIndex; i++) {
//            List<Integer> preList = res;
//            res = new ArrayList<>();
//            for (int j = 0; j <= i; j++) {
//                if (j == 0 || j == i) {
//                    res.add(1);
//                } else {
//                    res.add(preList.get(j - 1) + preList.get(j));
//                }
//            }
//        }
//        return res;
//    }

    // Method 2 1ms 97.72%
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        long cur = 1;
        for (int i = 0; i <= rowIndex; i++) {
            res.add((int) cur);
            cur = cur*(rowIndex - i) / (i + 1);
        }
        return res;
    }
}
