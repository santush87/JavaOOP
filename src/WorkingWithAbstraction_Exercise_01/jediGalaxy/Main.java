package WorkingWithAbstraction_Exercise_01.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int columns = dimensions[1];

        int[][] matrix = new int[rows][columns];

        int number = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                matrix[row][col] = number++;
            }
        }

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] hero = Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int[] villain = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int villainRow = villain[0];
            int villainCol = villain[1];

            while (villainRow >= 0 && villainCol >= 0) {
                if (villainRow < matrix.length && villainCol < matrix[0].length) {
                    matrix[villainRow][villainCol] = 0;
                }
                villainRow--;
                villainCol--;
            }

            int heroRow = hero[0];
            int heroCol = hero[1];

            while (heroRow >= 0 && heroCol < matrix[1].length) {
                if (heroRow < matrix.length && heroCol >= 0) {
                    sum += matrix[heroRow][heroCol];
                }
                heroCol++;
                heroRow--;
            }
            command = scanner.nextLine();
        }
        System.out.println(sum);
    }
}
