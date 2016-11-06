package haas.zp3jv.s04;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by AntoninHaas.
 */
public class AnimalFarm {
    private List<Animal> animalList = new LinkedList<>();

    public void add(String name, Species species, Gender gender) {
        animalList.add(new Animal(name, species, gender));
    }

    public void list() {
        animalList.forEach(Animal::print);
    }
}