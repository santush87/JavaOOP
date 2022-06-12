package Encapsulation_Exercises.PizzaCalories_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] first = scanner.nextLine().split("\\s+");
        String pizzaName = first[1];
        int pizzaTop = Integer.parseInt(first[2]);

        Pizza pizza = new Pizza(pizzaName, pizzaTop);

        String[] second = scanner.nextLine().split("\\s+");
        String flourType = second[1];
        String bakingTechnique = second[2];
        double doughtWeight = Double.parseDouble(second[3]);

        Dough dough = new Dough(flourType, bakingTechnique, doughtWeight);
        pizza.setDought(dough);

        String topps = scanner.nextLine();
        while (!topps.equals("END")){
            String toppingType = topps.split("\\s+")[1];
            double toppingWeight = Double.parseDouble(topps.split("\\s+")[2]);

            Topping topping = new Topping(toppingType, toppingWeight);

            pizza.addTopping(topping);
            topps = scanner.nextLine();
        }

        System.out.printf("%s - %.02f",pizza.getName(), pizza.getOverallCalories());
    }
}
