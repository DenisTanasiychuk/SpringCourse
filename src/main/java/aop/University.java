package aop;

import org.springframework.stereotype.Component;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student std1 = new Student("Denis ", 4, 3.5);
        Student std2 = new Student("Katrin ", 1, 5);
        Student std3 = new Student("Stesha ", 2, 4);

        students.add(std1);
        students.add(std2);
        students.add(std3);
    }

    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents ");
        System.out.println(students.get(3));

        System.out.println("Information from method getStudents ");
        System.out.println(students);
        return students;
    }
}
