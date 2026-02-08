package src.creational.Factory;
 
public class Main {
    // Now lets say we want to send a notification, we can use the factory to create the notification object and then use it to send the notification
    public static void main(String[] args) {
        NotificationService notificationService=new NotificationService();
        notificationService.sendNotification("EMAIL", "Hello World!");
        NotificationService notificationService2=new NotificationService();
        notificationService2.sendNotification("SMS", "Hello World!");
       
}


}