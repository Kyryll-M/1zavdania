import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість рядків для піраміди: ");
        int rows = scanner.nextInt();

        if (rows <= 0) {
            System.out.println("Кількість рядків повинна бути більше 0.");
            return;
        }

        int[][] pyramidArray = new int[rows][];
        for (int i = 0; i < rows; i++) {
            pyramidArray[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                pyramidArray[i][j] = (i + 1) * 10 + j;
            }
        }

        System.out.println("\nПіраміда у звичайному порядку:");
        printPyramid(pyramidArray);

        System.out.println("\nПіраміда у зворотному порядку:");
        printReversePyramid(pyramidArray);

        scanner.close();
    }

    static void printPyramid(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printReversePyramid(int[][] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}