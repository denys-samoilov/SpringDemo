package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext spring = new AnnotationConfigApplicationContext(Greetings.class);
        Greetings greetings = spring.getBean(Greetings.class);
        greetings.sayHelloWorld();
    }
}

class Greetings {
    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }
}