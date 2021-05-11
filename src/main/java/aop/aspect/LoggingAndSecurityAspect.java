package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
//* любой параметр
// .. любое количество любых параметров

//    @Before("execution(public void getBookName(..))")
//    public void beforeGetBookNameAdvice() {
//        System.out.println("beforeGetBookNameAdvice: Попытка получить книгу с именем");
//    }
    @Pointcut("execution(* get*())")
    public void allGetMethods(){}

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: попытка получить книгу/журнал");
    }
    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
    }
//
//    @Before("execution(public * return*())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка вернуть книгу");
//    }


}
