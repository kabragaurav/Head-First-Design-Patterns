package creational.singleton;

/**
 * @author gaurav kabra
 * @since 29/Sep/2023
 **/

public class DoubleCheckLocking {

    private static DoubleCheckLocking INSTANCE;

    private DoubleCheckLocking() {
        // Private ctor so not explicit object creation
    }

    /**
     * First null check is optimization to possibly avoid cost of synchronization on app performance
     */
    public static DoubleCheckLocking getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckLocking.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLocking();
                }
            }
        }
        return INSTANCE;
    }

}
