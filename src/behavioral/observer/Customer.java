package behavioral.observer;

/**
 * @author gaurav kabra
 * @since 21/Sep/2023
 **/

public class Customer implements Person {

    private static long counter = 0;
    private long id;

    Customer() {
        this.id = counter++;
    }

    @Override
    public void update() {
        System.out.println(String.format("Hey, %s new video added", id));
    }

    /**
     * equals() and hashCode() should be overriden here
     * so that subscribers list can uniquely identity objects
     * But for simplicity not done
     */
}
