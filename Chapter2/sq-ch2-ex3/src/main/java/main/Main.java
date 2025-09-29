package main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new
                AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p1 = context.getBean("parrot1", Parrot.class);
        System.out.println(p1.getName());

        Parrot p2 =context.getBean("parrot2", Parrot.class);
        System.out.println(p2.getName());

        Parrot p3 =context.getBean("parrot3", Parrot.class);
        System.out.println(p3.getName());

        ComponentTest test = context.getBean("componentTest", ComponentTest.class);
        System.out.println(test.getN());

        Integer n=context.getBean(Integer.class);
        System.out.println(n);

        // Person 빈을 가져와서 Supplier가 제공하는 Parrot을 확인합니다.
        var person = context.getBean(Person.class);
        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's parrot: " + person.getParrot().getName());
    }
}