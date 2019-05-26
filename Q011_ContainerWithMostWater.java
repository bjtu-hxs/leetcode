public class Q011_ContainerWithMostWater {
    // Method 1 6ms 96.05%
    public int maxArea(int[] height) {
        int head = 0;
        int tail = height.length-1;
        int max = (tail - head) * Math.min(height[head], height[tail]);
        while (tail > head) {
            if (height[head] <= height[tail]) {
                head++;
            } else {
                tail--;
            }
            max = Math.max(max, (tail - head) * Math.min(height[head], height[tail]));
        }
        return max;
    }
}
