package haas.zp3jv.s04;

/**
 * Created by AntoninHaas.
 */
public class Animal {
    private String name;
    private Species species;
    private Gender gender;


    public Animal(String name, Species species, Gender gender) {
        this.name = name;
        this.species = species;
        this.gender = gender;
    }

    public void print() {
        StringBuilder output = new StringBuilder();

        output.append(name).append(" je ");
        if (gender.equals(Gender.MALE)) {
            output.append(species.getMale());
        } else {
            output.append(species.getFemale());
        }

        output.append(" a dela \"").append(species.getSound()).append("\".");

        System.out.println(output.toString());
    }
}