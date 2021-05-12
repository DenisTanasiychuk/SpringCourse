package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExeptionsHandlingAspect {
    @Before("aop.aspect.MyPointCuts.allGetMethods()")
    public void beforeGetExeptionsHandlingAspect(){
        System.out.println("beforeGetExeptionsHandlingAspect: ловим обрабатываем исключение при попытке получить книгу/журнал ");
    }
}
