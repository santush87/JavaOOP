package Encapsulation_Exercises.PizzaCalories_04;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dought;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
    }

    private void setName(String name) {
        if (!name.trim().isEmpty() && name.trim().length() <= 15) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }

    public void setDought(Dough dought) {
        this.dought = dought;
    }

    private void setToppings(int numOfTopping) {
        if (numOfTopping >= 0 && numOfTopping <= 10) {
            this.toppings = new ArrayList<>();
        } else {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double getOverallCalories() {
        return dought.calculateCalories() + toppings.stream()
                .mapToDouble(s -> s.calculateCalories()).sum();
    }
}
