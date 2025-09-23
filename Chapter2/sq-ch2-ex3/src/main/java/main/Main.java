package main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new
                AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean("parrot1", Parrot.class);
        System.out.println(p.getName());
    }
}