package TrafficLights_04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lights = scanner.nextLine().split("\\s+");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            update(lights);
            printLights(lights);
            System.out.println();
        }

    }

    private static void printLights(String[] lights) {
        Arrays.stream(lights).forEach(s -> System.out.print(s + " "));
    }

    static void update(String[] input){
        for (int i = 0; i < input.length; i++) {
            String color = input[i];
            switch (color){
                case "RED":
                    input[i] = "GREEN";
                    break;
                case "YELLOW":
                    input[i] = "RED";
                    break;
                case "GREEN":
                    input[i] = "YELLOW";
                    break;
            }
        }
    }
}
