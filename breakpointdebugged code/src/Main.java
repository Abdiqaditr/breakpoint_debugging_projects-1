// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = calculateSum(numbers);
        System.out.println("Sum of numbers: " + result);
    }

    public static int calculateSum(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }



}