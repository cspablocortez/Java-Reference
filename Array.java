// v1
public class Array {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method1() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] squares = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            squares[i] = arr[i] * arr[i];
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(squares[i]);
        }
    }

    private static void method2() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] squares = new int[arr.length];
        int i = 0;
        for (int n : arr) {
            squares[i] = n * n;
            System.out.println(squares[i]);
            i++;
        }
    }
}


