package tanden.spring_course.spring_introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("catBean")
public class Cat implements Pet {
    //private String name;
    public Cat() {
        System.out.println("Cat bean is created");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void say() {
        System.out.println("Meow- Meow");

    }
    //@PostConstruct
    public void init() {
        System.out.println("Class Cat: init method");
    }
   // @PreDestroy
    public void destroy() {
        System.out.println("Class Cat: destroy method");
    }
}
