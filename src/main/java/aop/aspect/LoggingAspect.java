package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
//* любой параметр
// .. любое количество любых параметров

    @Before("execution(public * getBookName(..))")
    public void beforeGetBookNameAdvice() {
        System.out.println("beforeGetBookNameAdvice: Попытка получить книгу с именем");
    }

    @Before("execution(public void get*(String))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }

    @Before("execution(public * return*())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка вернуть книгу");
    }


}
