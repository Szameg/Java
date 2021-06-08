public class Main {

    public static void whichIsLonger(int[] numbersOne, int[] numbersTwo) {
        if (numbersOne.length > numbersTwo.length) {
            System.out.println("The first array is longer which has " +numbersOne.length+ " elements.");
        } else if (numbersTwo.length > numbersOne.length) {
            System.out.println("The second array is longer which has " +numbersTwo.length+ " elements.");
        } else {
            System.out.println("The two arrays' length equal. They have " +numbersOne.length+ " elements.");
        }
    }

    public static void main(String[] args) {
        int[] numOne = new int[] {1,2};
        int[] numTwo = new int[] {4,5,6};
        whichIsLonger(numOne,numTwo);
    }
}
