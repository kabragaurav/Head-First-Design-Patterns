package behavioral.observer;

/**
 * @author gaurav kabra
 * @since 21/Sep/2023
 **/

public class driver {

    // driver - main method
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        Management management1 = new Management();
        Management management2 = new Management();

        Cred cred = new Cred();

        cred.addSubscriber(customer1);
        cred.addSubscriber(customer2);
        cred.addSubscriber(management1);
        cred.addSubscriber(management2);

        cred.notifySubscribers();
        cred.removeSubscriber(customer1);
        cred.removeSubscriber(management2);
        cred.notifySubscribers();
    }

}
