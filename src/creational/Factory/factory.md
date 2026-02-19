Here we have an interface Notification, which is implemented by two classes SMSNotification and EmailNotification. The interface has one method send(String message) which is overriden by both the subclasses.

Now we also have a NotificationFactory which has a public getNotification(String type) method, it takes type param and returns that type of Notification instance


NotificationService class needs a Notification instance to send notification, so it gets an instance using the factory class's get method, it then uses the sendNotification message implemented by that specific Notification type ( be it SMS or Email)


Now in the main class we initialise a NotificationService class instance and use its send method.