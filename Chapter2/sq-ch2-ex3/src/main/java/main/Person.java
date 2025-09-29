package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.function.Supplier;

@Component
public class Person {

    private final String name = "Ella";
    
    @Autowired
    private Supplier<Parrot> parrotSupplier;

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        // Supplier의 get() 메소드를 호출하는 시점에 Parrot 빈을 가져옵니다.
        return parrotSupplier.get();
    }
}
