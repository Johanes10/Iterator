package iterator;

public class NotificationBar {
    NotificationCollection notifications;

    public NotificationBar(){
        this.notifications= new NotificationCollection();
    }
    public void printNotifications(){
        Iterator iterator= notifications.createIterator();
        System.out.println(
            "_ _ _ _ _ _ _ _ _ _ NOTIFICATION BAR _ _ _ _ _ _ _ _ _ _ ");
        while (iterator.hasNext()){
            Notification n=(Notification)iterator.next();
            System.out.println(n.getNotification());
        }
    }
}
