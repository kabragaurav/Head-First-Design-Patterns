package creational.singleton;


/**
 * @author gaurav kabra
 * @since 29/Sep/2023
 **/

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        // Private ctor so not explicit object creation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            // lazy initialization. Other way would have been to initialize on line 11
            instance = new Singleton();
        }

        return instance;
    }

}
