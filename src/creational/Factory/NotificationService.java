package src.creational.Factory;

public class NotificationService {
    // we only want the service class to handle business logic and not be responsible for creating the notification objects
    // so we will use the factory class to create the notification objects and then use them in
    public void sendNotification(String type, String message) {
        Notification notification=NotificationFactory.getNotification(type);
        notification.sendNotification(message);
   }
}
