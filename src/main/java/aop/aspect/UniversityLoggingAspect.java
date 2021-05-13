package aop.aspect;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: Логируем получение списка студентов" +
                " перед методом getStudents");
    }
//    @AfterReturning(pointcut = "execution(* getStudents())"
//            , returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//
//        nameSurname = "Mr. " + nameSurname;
//
//        firstStudent.setNameSurname(nameSurname);
//
//
//        double avgGread = firstStudent.getAvgGrade();
//
//        avgGread = avgGread - 0.5;
//
//        firstStudent.setAvgGrade(avgGread);
//
//
//
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: Логируем получение списка студентов" +
//                " после метода getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())"
//        , throwing = "exeption")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exeption) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: Логируем выброс исключения" + exeption);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: Логируем нормальное завершение работы или выброс исключения ");

    }

}
