package tanden.spring_course.spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("tanden")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());

    }

}
