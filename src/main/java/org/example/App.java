package org.example;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static int getRandomNum() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}
