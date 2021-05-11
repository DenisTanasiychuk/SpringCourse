package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {
    @Autowired
    Book book;

//    @Override
    public void getBook(Book book) {
        System.out.println("Мы берём книгу из SchoolLibrary");
        System.out.println(book.getBookName());
    }
}
