package tanden.spring_course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContex3.xml");

//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();

        Person personBean = context.getBean("personBean", Person.class);
        personBean.callYourPet();

        System.out.println(personBean.getSurname());
        System.out.println(personBean.getAge());


        context.close();

    }
}
