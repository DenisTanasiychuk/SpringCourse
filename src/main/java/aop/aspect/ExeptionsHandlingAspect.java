package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExeptionsHandlingAspect {
    @Before("aop.aspect.MyPointCuts.allAddMethods()")
    public void beforeAddExeptionsHandlingAspect(){
        System.out.println("beforeAddExeptionsHandlingAspect: ловим обрабатываем исключение при попытке получить книгу/журнал ");
        System.out.println("------------------------------------------------------------------");
    }
}
