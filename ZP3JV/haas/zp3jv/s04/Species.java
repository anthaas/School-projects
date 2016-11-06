package haas.zp3jv.s04;

/**
 * Created by AntoninHaas.
 */
public enum Species {
    PES("pes", "fena", "haf-haf"),
    KACHNA("kacer", "kacena", "ga-ga");

    private final String male;
    private final String female;
    private final String sound;

    Species(String male, String female, String sound) {
        this.male = male;
        this.female = female;
        this.sound = sound;
    }

    public String getMale() {
        return male;
    }

    public String getFemale() {
        return female;
    }

    public String getSound() {
        return sound;
    }
}
