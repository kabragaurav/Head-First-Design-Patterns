package creational.singleton;


/**
 * @author gaurav kabra
 * @since 29/Sep/2023
 **/

public class Driver {

    // driver - main method
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);

        SingletonUsingEnum enum1 = SingletonUsingEnum.INSTANCE;
        SingletonUsingEnum enum2 = SingletonUsingEnum.INSTANCE;

        System.out.println(enum1 == enum2);
    }

}
