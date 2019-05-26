import java.util.*;

public class ByteDanceInterview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//总人数
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int cur = scanner.nextInt();
            ArrayList<Integer> list = map.getOrDefault(cur, new ArrayList<>());
            list.add(i);
            map.put(cur, list);
        }
        int times = scanner.nextInt();
        for (int i = 0; i < times; i++) {
            int count = 0;
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int target = scanner.nextInt();
            ArrayList<Integer> list = map.get(target);
            if (list == null) {
                System.out.println(0);
            } else {
                for (int a :
                        list) {
                    if (a + 1 >= start && a + 1 <= end) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }

    }

}