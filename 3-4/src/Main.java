import java.util.Arrays;

public class Main {

    public static void whichIsLonger(int[] numbersOne, int[] numbersTwo) {
        if (numbersOne.length > numbersTwo.length) {
            System.out.println("The first array is longer which has " + numbersOne.length + " elements.");
        } else if (numbersTwo.length > numbersOne.length) {
            System.out.println("The second array is longer which has " + numbersTwo.length + " elements.");
        } else {
            System.out.println("The two arrays' length equal. They have " + numbersOne.length + " elements.");
        }
    }

    public static void matrixMaker(int number) {
        try {
            if (number == 0) {
                throw new Exception();
            }
            int[][] matrix = new int[number][number];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == j) {
                        matrix[i][j] = number;
                    } else {
                        matrix[i][j] = 0;
                    }
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int[] numOne = new int[]{1, 2};
        int[] numTwo = new int[]{4, 5, 6};
        whichIsLonger(numOne, numTwo);

        matrixMaker(5);
    }
}
