package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";
    private final String second_message = "Hello !";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        System.out.println(new App().getSecondMessage());
    }

    private final String getMessage() {
        return message;
    }
    
    private final String getSecondMessage() {
        return second_message;
    }
}
