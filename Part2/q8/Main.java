package Part2.q8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        //A - Function
        Function<String, String> a = String::toUpperCase;

        //B - BiFunction
        BiFunction<Double, Double, Double> b = (x, y) -> x * y;

        //C - Comparator
        List<Property> properties = Arrays.asList();
        properties.sort(new PropertyComparator());

        //D - BiFuntion
        BiFunction<String,String,String> d = (x, y) -> x + " " + y;

        //E - BiFunction
        BiFunction<String, String, String> e = (x, y) -> x + " " + y;

    }
}

class Property {
    private int room;

    public int getRoom() {
        return room;
    }
}

class PropertyComparator implements Comparator<Property> {
    @Override
    public int compare(Property o1, Property o2) {
        return o1.getRoom() - o2.getRoom();
    }
}
