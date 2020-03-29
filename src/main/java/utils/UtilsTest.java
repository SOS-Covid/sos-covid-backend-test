package utils;

import java.util.Random;

public class UtilsTest {

    public static String generateValidEmail(){
        Random r = new Random();
        int x = r.nextInt();

        return "teste" + Integer.toString(x) + "@teste.com";
    }
}
