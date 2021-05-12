package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.xml.ws.Action;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook();
//        uniLibrary.returnBook();
        uniLibrary.getMagazine();
//        uniLibrary.returnMagazine();

        uniLibrary.addBook("Denis", book);
        uniLibrary.addMagazine();


//

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook(schoolLibrary.book);


        context.close();
    }
}
