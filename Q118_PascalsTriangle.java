import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q118_PascalsTriangle {
    // Method 1 1ms 95.26%
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }
        res.add(Arrays.asList(1));
        for (int i = 1; i < numRows ; i++) {
            List<Integer> subList = new ArrayList<>();
            List<Integer> preList = res.get(i - 1);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    subList.add(1);
                } else {
                    subList.add(preList.get(j - 1) + preList.get(j));
                }
            }
            res.add(subList);
        }
        return res;
    }
}
