package Part2.q4;

public enum NotificationService {
    INSTANCE("Alert");
    private final String serviceName;

    NotificationService(String alert) {
        this.serviceName = alert;
    }

    public String getServiceName() {
        return serviceName;
    }

    void sendAlert(String message){
        System.out.println(NotificationService.INSTANCE.getServiceName() + ":" + message);
    }
}
