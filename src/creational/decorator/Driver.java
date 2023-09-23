package creational.decorator;

import java.util.Arrays;

/**
 * @author gaurav kabra
 * @since 23/Sep/2023
 **/

public class Driver {

    // driver - main method
    public static void main(String[] args) {
        Person boy = new Boy();
        boy = new Shirt(boy);
        boy = new Sweater(boy);
        boy = new Raincoat(boy);
        System.out.println(boy.getDescription());

        Person girl = new Girl();
        girl = new Saree(girl);
        System.out.println(girl.getDescription());
    }

}
