package Part2.q7;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Map<String, String> beverageSugarMao = Map.ofEntries(
                Map.entry("Cold Brew Cofee","0"),
                Map.entry("Iced Green Tea", "12"),
                Map.entry("Sparkling Water","N/A"),
                Map.entry("Lemonade", "28"),
                Map.entry("Berry Smoothie", "N/A"),
                Map.entry("Chai Latte", "22"),
                Map.entry("Coconut Water", "15"),
                Map.entry("Apple Juice","34"),
                Map.entry("Classic Soda","40"),
                Map.entry("Orange Juice","23"),
                Map.entry("Detox Green Smoothie","16")
        );

        //1st and second
        System.out.println();
        beverageSugarMao.entrySet().stream()
                .filter(e->Optional.ofNullable(parse(parse(e.getValue()))).isPresent())
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        //filter
        System.out.println(" ");
        beverageSugarMao.entrySet().stream()
                .filter(e->e.getKey().toLowerCase().contains("Juice".toLowerCase()) || e.getKey().toLowerCase().contains("Smoothie".toLowerCase()))
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));


        //30 gram
        System.out.println(" ");
        System.out.println("Filter 30 grams");
        beverageSugarMao.entrySet().stream()
                .filter(e-> {
                    try{
                        return Integer.parseInt(e.getValue()) < 30;
                    } catch (NumberFormatException ex){
                        return false;
                    }
                })
                .forEach(e->System.out.println(e.getKey() + " " + e.getValue()));



        // sort
        System.out.println(" ");
        beverageSugarMao.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue).thenComparing(Map.Entry::getKey))
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        //print
        System.out.println(" ");
        beverageSugarMao.entrySet().stream()
                .forEach(e->System.out.println(e.getKey() + ": " + e.getValue()));
    }

    static String parse(String input) {
        try {
            return ""+ Integer.parseInt(input);
        }catch (NumberFormatException e) {
            return null;
        }
    }
}
