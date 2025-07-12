package art2.q3;

public interface BillingProcessor {
    boolean processBill(String patientId, double amount);

    default void printDetailedBill(String patientId, double amount){
        System.out.println(formatDetailedBill(patientId, amount));
    }

    private String formatDetailedBill(String patientId, double amount){
        return String.format("Hostpital Bill for Patient %s: $%.2f procesed", patientId, amount);
    }

    static boolean validateInsuranceId(String insuranceId){
        return insuranceId.matches("[0-9a-zA-Z]{10}");
    }

    static boolean validatePatientId(String patientId){
        //start with HSP and length is 8
        if(patientId.startsWith("HSP") && patientId.length() == 8)
            return true;
        return false;
       // return patientId.matches("HSP[0-9a-zA-Z]{10}");
    }
}
