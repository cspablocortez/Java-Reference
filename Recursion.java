public class Recursion {
   public static void main(String[] args) {
    int upTo = 4;
    for (int i = 0; i <= upTo; i++) {
        System.out.println(fibonacci(i));
    }
   }

    private static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    } 
}