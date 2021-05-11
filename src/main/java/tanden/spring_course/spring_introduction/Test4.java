package tanden.spring_course.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContex2.xml");

        Cat myCat = context.getBean("myPet", Cat.class);
     //   myCat.setName("Belka");
        Cat yourCat = context.getBean("myPet", Cat.class);
   //     yourCat.setName("Strelca");

        System.out.println("Переменные ссылаются на один и тот же объект?" + (myCat==yourCat) );
        System.out.println(myCat);
        System.out.println(yourCat);
//        System.out.println(myCat.getName());
//        System.out.println(yourCat.getName());

        context.close();



    }
}
