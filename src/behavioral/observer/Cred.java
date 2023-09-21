package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaurav kabra
 * @since 21/Sep/2023
 **/

public class Cred implements Publisher {

    private static List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public boolean addSubscriber(Subscriber subscriber) {
        return subscribers.add(subscriber);
    }

    @Override
    public boolean removeSubscriber(Subscriber subscriber) {
        return subscribers.remove(subscriber);
    }

    @Override
    public boolean notifySubscribers() {
        // Using update method below, since notify is built-in Object class method
        // and is used in threads. Overriding that will be unwise
        List<Exception> exceptions = new ArrayList<>();
        try {
            subscribers.stream()
                    .forEach(subscriber -> subscriber.update());
        } catch (Exception ex) {
            exceptions.add(ex);
        }

        if (!exceptions.isEmpty()) {
            // log errors
            return false;
        }
        return true;
    }
}
