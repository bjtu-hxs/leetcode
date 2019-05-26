public class Q048_RotateImage {
//    // Method_01  2ms 93.40%
//    public void rotate(int[][] matrix) {
//        int tmp;
//        int length = matrix.length;
//        // fold along the diagonal
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length - i; j++) {
//                tmp = matrix[length - j - 1][length - i - 1];
//                matrix[length - j - 1][length - i - 1] = matrix[i][j];
//                matrix[i][j] = tmp;
//            }
//        }
//        // fold along the median line
//        for (int i = 0; i < length / 2; i++) {
//            for (int j = 0; j < length; j++) {
//                tmp = matrix[length - i - 1][j];
//                matrix[length - i - 1][j] = matrix[i][j];
//                matrix[i][j] = tmp;
//            }
//        }
//    }

    // Method_02  2ms  93.40%
    public void rotate(int[][] matrix) {
        int tmp;
        int length = matrix.length;
        for (int i = 0; i < length / 2; i++) {
            for (int j = 0; j < (length + 1) / 2; j++) {
                tmp = matrix[i][j];
                int i1 = j;
                int j1 = matrix.length - 1 - i;
                int i2 = j1;
                int j2 = matrix.length - 1 - j;
                int i3 = j2;
                int j3 = i;
                matrix[i][j] = matrix[i3][j3];
                matrix[i3][j3] = matrix[i2][j2];
                matrix[i2][j2] = matrix[i1][j1];
                matrix[i1][j1] = tmp;
            }
        }
    }
}
