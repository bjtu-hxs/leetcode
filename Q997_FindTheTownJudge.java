public class Q997_FindTheTownJudge {
//    // Method 1 5ms 99.24%
//    public int findJudge(int N, int[][] trust) {
//        int[][] people = new int[N][2];
//        for(int[] person : trust) {
//            people[person[0]-1][0]++;
//            people[person[1]-1][1]++;
//        }
//        for(int i = 0; i < N; i++) {
//            if(people[i][0] == 0 && people[i][1] == N - 1) {
//                return i + 1;
//            }
//        }
//        return -1;
//    }

    public int findJudge(int N, int[][] trust) {
        int[] people = new int[N];
        for(int[] person : trust) {
            // judge doesn't trust anyone
            people[person[0]-1]--;
            // people all except judge trust judge
            people[person[1]-1]++;
        }
        for(int i = 0; i < N; i++) {
            if(people[i] == N - 1) {
                return i + 1;
            }
        }
        return -1;
    }
}
