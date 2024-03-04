public class CodingBat {
    public static void main(String[] args) {
        int result = sumHeights2(new int[]{5, 3, 6, 7, 2}, 2, 4); // → 7
        System.out.println(result);
    }


    public static int sumHeights2(int[] heights, int start, int end) {
        // Find differences first

        int sum = 0;

        for (int i = start; i < end; i++) {
            int difference = Math.abs(heights[i] - heights[i + 1]);
            System.out.println(difference);
        }

        return sum;
    }
    


    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
          if (scores[i] < scores[i - 1]) {
            return false;
          }
        }
        return true;
    }
}