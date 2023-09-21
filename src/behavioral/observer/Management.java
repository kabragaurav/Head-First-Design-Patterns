package behavioral.observer;

/**
 * @author gaurav kabra
 * @since 21/Sep/2023
 **/

public class Management implements Person {

    private static long counter = 0;
    private long id;

    Management() {
        this.id = counter++;
    }

    @Override
    public void update() {
        System.out.println(String.format("Hey, %s time for meeting", id));
    }

    /**
     * equals() and hashCode() should be overriden here
     * so that subscribers list can uniquely identity objects
     * But for simplicity not done
     */
}
