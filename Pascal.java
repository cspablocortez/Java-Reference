public class Pascal {
    public static void main(String[] args) {
        int numRows = 7; 
        
        StringBuilder output = new StringBuilder();
        
        int[][] triangle = generatePascalsTriangle(numRows);
        
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                output.append(triangle[i][j]).append(" ");
            }
            output.append("\n");
        }

        System.out.println(output.toString());
    }

    private static int[][] generatePascalsTriangle(int numRows) {
        int[][] triangle = new int[numRows][numRows];
        
        for (int i = 0; i < numRows; i++) {
            triangle[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        
        return triangle;
    }
}