package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.returnMagazine())")
//    private void methodReturnMagazineFromUniLibrary() {
//
//    }
//
//    @Pointcut("methodReturnMagazineFromUniLibrary() && !allMethodsFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {
//
//    }
//
//    @Before("allMethodsFromUniLibrary()")
//    public void beforeAllMethodsFromUniLibraryAdvice() {
//        System.out.println("beforeAllMethodsFromUniLibraryAdvice: Writing Log #1");
//
//    }
//
//    @Before("methodReturnMagazineFromUniLibrary()")
//    public void beforeMethodReturnMagazineFromUniLibraryAdvice() {
//        System.out.println("beforeMethodReturnMagazineFromUniLibraryAdvice: Writing Log #2");
//
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineFromUniLibraryAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineFromUniLibraryAdvice: Writing Log #3");
//
//    }


    //    @Pointcut("execution(* aop.UniLibrary.get*(..))")
//    public void allGetMethodsFromUniLibrary() {
//
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*(..))")
//    public void allReturnMethodsFromUniLibrary() {
//
//    }
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    public void allGetAndReturnMethodsFromUniLibrary(){
//
//    }
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: Writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: Writing Log #2");
//    }
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: Writing Log #3");
//    }


    //* любой параметр
// .. любое количество любых параметров

//    @Before("execution(public void getBookName(..))")
//    public void beforeGetBookNameAdvice() {
//        System.out.println("beforeGetBookNameAdvice: Попытка получить книгу с именем");
//    }


    @Before("aop.aspect.MyPointCuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: попытка получить книгу/журнал");
    }


    @Before("execution(public * return*())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка вернуть книгу");
    }


}
