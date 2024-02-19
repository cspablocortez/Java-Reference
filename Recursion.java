public class Recursion {
    public static void main(String[] args) {
        int upTo = 4;
        int[] fibArray = new int[fibonacci(upTo)];

        for (int i = 0; i < upTo; i++) {
            fibArray[i] = fibonacci(i);
        }

        for (int i = 0; i < upTo; i++) {
            System.out.println(fibArray[i]);
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

// -------------------------------------------------

// A
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for (int i = 0; i < 10; i++) {
            System.out.println(sequence(i));
        }
    }
    public static int sequence(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return sequence(n - 1) + sequence(n - 2);
        }
    }
}

import java.util.ArrayList; 
public class Main {
    public static void main(String[] args) {
        ArrayList<Int> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(sequence[i])
        }
        System.out.println(list);
    }
    public static int sequence(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return sequence(n - 1) + sequence(n - 2);
        }
    }
}