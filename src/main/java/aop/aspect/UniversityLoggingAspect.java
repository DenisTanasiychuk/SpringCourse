package aop.aspect;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: Логируем получение списка студентов" +
                " перед методом getStudents");
    }
    @AfterReturning(pointcut = "execution(* getStudents())"
            , returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){

        Student firstStudent = students.get(0);

        String nameSurname = firstStudent.getNameSurname();

        nameSurname = "Mr. " + nameSurname;

        firstStudent.setNameSurname(nameSurname);


        double avgGread = firstStudent.getAvgGrade();

        avgGread = avgGread - 0.5;

        firstStudent.setAvgGrade(avgGread);




        System.out.println("afterReturningGetStudentsLoggingAdvice: Логируем получение списка студентов" +
                " после метода getStudents");
    }
}
