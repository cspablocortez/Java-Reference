public class CodingBat {
    public static void main(String[] args) {
        int[] scores = {1, 3, 2}; // false
        System.out.println(scoresIncreasing(scores));
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