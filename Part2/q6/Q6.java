package Part2.q6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6 {
    public static void printMedicationName(List<? extends Medication> meds){
        for (Medication med : meds) {
            System.out.print(" " + med.getName());
        }
    }

    public static void addPainkillers(List<? super PainKiller> painkillerList){
        PainKiller painKiller = new PainKiller("Ibuprohen");
        PainKiller painKiller2 = new PainKiller("Acetaminohen");
        PainKiller painKiller3 = new PainKiller("Aspirin");
        painkillerList.add(painKiller);
        painkillerList.add(painKiller2);
        painkillerList.add(painKiller3);

        System.out.println("\nNew painkillers: " + painkillerList.size());
        System.out.println(painkillerList);
    }

    public static void main(String[] args) {
        List<Medication> meds = Arrays.asList(
            new Medication("Saline"),
            new Medication("Vitamin C"));
        List<PainKiller> painkillers = Arrays.asList(
                new PainKiller("Ibuprofen"),
                new PainKiller("Aspirin")
        );
        List<Antibiotic> antibiotics = Arrays.asList(
                new Antibiotic("Amoxicillin")
        );

        System.out.println("\nMedication List");
        printMedicationName(meds);
        System.out.println("\nPainkillers");
        printMedicationName(painkillers);
        System.out.println("\nAntibiotics");
        printMedicationName(antibiotics);

        List<PainKiller> painkillers2 = new ArrayList<>();
        addPainkillers(painkillers2);
    }
}
