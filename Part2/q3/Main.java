package Part2.q3;

public class Main {
    public static void main(String[] args) {
        BillingProcessor processor = new BillingProcessor() {
            @Override
            public boolean processBill(String patientId, double amount) {
                System.out.printf("Processes a bill for a given %s and %.2f ",patientId,amount);
                return true;
            }
        };

        processor.processBill("HSP12345", 123.123);
        System.out.println("\n");
        processor.printDetailedBill("HSP12345",123.123);

        System.out.println("IIHSP12345 is valid? " + BillingProcessor.validateInsuranceId("IIHSP12345"));
        System.out.println("123456789 is valid? " + BillingProcessor.validateInsuranceId("123456789"));
        System.out.println("123456789@ is valid? " + BillingProcessor.validateInsuranceId("123456789@"));

        System.out.println("HSP12345 is valid? " + BillingProcessor.validatePatientId("HSP12345"));
        System.out.println("HSP1234 is valid? " + BillingProcessor.validatePatientId("HSP1234"));
        System.out.println("ASP12345 is valid? " + BillingProcessor.validatePatientId("ASP12345"));
    }
}
