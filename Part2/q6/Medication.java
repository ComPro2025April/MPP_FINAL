package Part2.q6;

public class Medication {
    private final String name;

    public Medication(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                '}';
    }
}
