package haas.zp3jv.s07;

import haas.zp3jv.s07.cookbook.Ingredient;
import haas.zp3jv.s07.cookbook.Recipe;
import haas.zp3jv.s07.cookbook.Unit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by AntoninHaas.
 */
public class Main {
    public static void main(String[] args) {
        //task1
        List<Integer> l = new ArrayList<>();
        int[] a = new int[10];
        for (int i = 1; i <= 10; i++) {
            l.add(i);
            a[i - 1] = i;
        }

        a = odd(a);
        l = oddNumbers(l);
        for (int i : l) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        //task2
        Recipe recipe = new Recipe();
        recipe.add(new Ingredient("mouka", Unit.kg, 8.9), 0.5);
        recipe.add(new Ingredient("mleko", Unit.l, 18.9), 0.7);
        recipe.add(new Ingredient("cukr", Unit.kg, 32.1), 0.3);
        recipe.add(new Ingredient("maslo", Unit.kg, 16.9), 0.1);

        List<Ingredient> list = new LinkedList<>();
        list.add(new Ingredient("mouka", Unit.kg, 8.9));
        list.add(new Ingredient("mleko", Unit.l, 18.9));
        list.add(new Ingredient("cukr", Unit.kg, 32.1));
        list.add(new Ingredient("maslo", Unit.kg, 16.9));

        System.out.println("Dle ceny:");
        list = recipe.getIngredientsByPrice();
        for (Ingredient i : list) {
            System.out.println(i.toString());
        }
        System.out.println();
        System.out.println("Cena: " + recipe.getPrice() + Unit.kc);
        System.out.println("Nejdrazsi polozka: " + recipe.getTheMostExpensiveIngredient());
        System.out.println("Lze uvarit? " + recipe.isCookable(list));
        System.out.println("To string:");
        System.out.println(recipe.toString());
    }

    private static int[] odd(int[] arg) {
        return Arrays.stream(arg).filter(n -> n % 2 != 0).toArray();
    }

    private static List<Integer> oddNumbers(List<Integer> arg) {
        return arg.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
    }
}
