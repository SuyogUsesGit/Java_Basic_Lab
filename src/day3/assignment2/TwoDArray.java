package day3.assignment2;

public class TwoDArray {

    public static void main(String[] args) {

        int[][] firstArrayMatrix = {{1,1,1}, {1,1,1}};
        int[][] secondArrayMatrix = {{2,2,2}, {2,2,2}};

        TwoDArray twoDArray = new TwoDArray();
        System.out.println("Matrix 1");
        twoDArray.displayMatrix(firstArrayMatrix);
        System.out.println("Matrix 2");
        twoDArray.displayMatrix(secondArrayMatrix);
        twoDArray.calculateSum(firstArrayMatrix, secondArrayMatrix);
    }

    public void displayMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void calculateSum(int[][] x, int[][] y) {
        System.out.println("Sum of the matrices");
        for(int i=0; i<x.length; i++) {
            for (int j=0; j<x[i].length; j++) {
                System.out.print(x[i][j] + y[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

}
