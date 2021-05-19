package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();


        Session session = null;
        try {


//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Denis", "Tanasiychuk", "IT", 70000);
//
//            Detail detail = new Detail("Rostov-on-Don", "89998887766", "DenisHibernateStudy@gmail.com");
//
//            employee.setEmpDetail(detail);
//
//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Oleg", "Sidorov", "Sale", 90000);
//
//            Detail detail = new Detail("Moscow", "88887776655", "Olejka@gmail.com");
//
//            employee.setEmpDetail(detail);


             session = factory.getCurrentSession();


            session.beginTransaction();

            Employee employee2 = session.get(Employee.class, 2);

            session.delete(employee2);
            session.getTransaction().commit();
            System.out.println(employee2.getEmpDetail());

            System.out.println("Done!");

        } finally {
            session.close();

            factory.close();

        }


    }
}
