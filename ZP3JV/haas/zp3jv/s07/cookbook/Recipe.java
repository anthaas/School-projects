package haas.zp3jv.s07.cookbook;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by AntoninHaas.
 */
public class Recipe {
    private Map<Ingredient, Double> ingredients = new HashMap<>();

    public Recipe() {
    }

    public void add(Ingredient i, Double amount) {
        ingredients.put(i, amount);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Ingredience:\n");
        ingredients.entrySet().forEach(e -> result.append(e.getKey().getName()).append(":\t").append(e.getValue()).append(e.getKey().getUnit()).append("\n"));
        return result.toString();
    }

    public double getPrice() {
        return ingredients
                .entrySet()
                .stream()
                .mapToDouble(e -> e.getKey().getPrice() * e.getValue())
                .sum();
    }

    public Ingredient getTheMostExpensiveIngredient() {
        return ingredients
                .keySet()
                .stream()
                .max(Comparator.comparing(Ingredient::getPrice))
                .get();
    }

    public boolean isCookable(List<Ingredient> availableIngredients) {
        return ingredients
                .keySet()
                .stream()
                .allMatch(availableIngredients::contains);
    }

    public List<Ingredient> getIngredientsByPrice() {
        return ingredients
                .keySet()
                .stream()
                .sorted(Comparator.comparing(Ingredient::getPrice))
                .collect(Collectors.toList());
    }
}
