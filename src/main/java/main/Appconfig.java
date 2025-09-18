package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
    @Bean
    Parrot parrot (){
        var p = new Parrot ();
        p.setName ("KoKo");
        return p;
    }
}
