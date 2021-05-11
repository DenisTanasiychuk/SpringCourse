package tanden.spring_course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContex2.xml");

        Cat myCat = context.getBean("myPet", Cat.class);
        myCat.say();
        context.close();
    }
}
