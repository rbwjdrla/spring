package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Appconfig.class);

        Parrot p = context.getBean(Parrot.class);
        p.setName("Koko");
        System.out.println(p.getName());
    }
}
