package Encapsulation_Exercises.PizzaCalories_04;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        //meat, veggies, cheese, or sauce
        if (toppingType.equals("Meat") || toppingType.equals("Veggies") ||
                toppingType.equals("Cheese") || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
        } else {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
    }

    private void setWeight(double weight) {
        if (weight > 0 && weight <= 50) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.toppingType));
        }
    }

    public double calculateCalories() {
        double topModifier = 0;
        switch (this.toppingType) {
            case "Meat":
                topModifier = 1.2;
                break;
            case "Veggies":
                topModifier = 0.8;
                break;
            case "Cheese":
                topModifier = 1.1;
                break;
            case "Sauce":
                topModifier = 0.9;
                break;
        }

        return (2 * weight) * topModifier;
    }
}
