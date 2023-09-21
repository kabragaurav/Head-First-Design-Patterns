package behavioral.observer;

import java.util.List;

/**
 * @author gaurav kabra
 * @since 21/Sep/2023
 **/

public interface Publisher {

    boolean addSubscriber(Subscriber subscriber);
    boolean removeSubscriber(Subscriber subscriber);
    boolean notifySubscribers();
}
