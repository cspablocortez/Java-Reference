import java.util.ArrayList; 

public class Recursion {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    private static int sequence(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return sequence(n - 1) + sequence(n - 2);
        }
    }

    private static void method1() {
        int upTo = 4;
        int[] fibArray = new int[fibonacci(upTo)];

        for (int i = 0; i < upTo; i++) {
            fibArray[i] = fibonacci(i);
        }

        for (int i = 0; i < upTo; i++) {
            System.out.println(fibArray[i]);
        }
    }

    private static void method2() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(sequence(i));
        }
        System.out.println(list);
    }


}

