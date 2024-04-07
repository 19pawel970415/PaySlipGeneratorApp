package com.example.payslipgenerator.service;

import com.example.payslipgenerator.employees.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
public class PaySlipGeneratorService {

    public static void setDataInDb() {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            JavaDeveloper javaJunior1 = new JavaDeveloper(null, "John", "Doe", "login", "password", "IntelliJ", Experience.JUNIOR);
            session.save(javaJunior1);

            JavaDeveloper javaJunior2 = new JavaDeveloper(null, "Alice", "Johnson", "login1", "password1", "NetBeans", Experience.JUNIOR);
            session.save(javaJunior2);

            JavaDeveloper javaMid1 = new JavaDeveloper(null, "Jane", "Smith", "login2", "password2", "Eclipse", Experience.MID);
            session.save(javaMid1);

            JavaDeveloper javaMid2 = new JavaDeveloper(null, "Bob", "Brown", "login3", "password3", "VS Code", Experience.MID);
            session.save(javaMid2);

            CSharpDeveloper cSharpJunior1 = new CSharpDeveloper(null, "Mark", "Davis", "login4", "password4", "Visual Studio", Experience.JUNIOR);
            session.save(cSharpJunior1);

            CSharpDeveloper cSharpMid1 = new CSharpDeveloper(null, "Emma", "Taylor", "login5", "password5", "Visual Studio Code", Experience.MID);
            session.save(cSharpMid1);

            CppDeveloper cppMid1 = new CppDeveloper(null, "David", "Lee", "login6", "password6", "CLion", Experience.MID);
            session.save(cppMid1);

            FrontEndDeveloper frontEndMid1 = new FrontEndDeveloper(null, "Olivia", "White", "login7", "password7", "Sublime Text", Experience.MID);
            session.save(frontEndMid1);

            DatabaseAnalyst dbAnalystMid1 = new DatabaseAnalyst(null, "Liam", "Harris", "login8", "password8", "MySQL Workbench", Experience.MID);
            session.save(dbAnalystMid1);

            PythonDeveloper pythonDeveloper1 = new PythonDeveloper(null, "James", "Bond", "login9", "password9", "PyCharm", Experience.SENIOR);
            session.save(pythonDeveloper1);

            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }

    public static Employee generatePaySlipForEmployee(String login) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            // Sprawdzenie tabeli JavaDeveloper
            Query<JavaDeveloper> javaQuery = session.createQuery("FROM JavaDeveloper WHERE login = :login", JavaDeveloper.class);
            javaQuery.setParameter("login", login);
            JavaDeveloper javaDeveloper = javaQuery.uniqueResult();
            if (javaDeveloper != null) {
                return javaDeveloper;
            }

            // Sprawdzenie tabeli CppDeveloper
            Query<CppDeveloper> cppQuery = session.createQuery("FROM CppDeveloper WHERE login = :login", CppDeveloper.class);
            cppQuery.setParameter("login", login);
            CppDeveloper cppDeveloper = cppQuery.uniqueResult();
            if (cppDeveloper != null) {
                return cppDeveloper;
            }

            // Sprawdzenie tabeli CSharpDeveloper
            Query<CSharpDeveloper> csharpQuery = session.createQuery("FROM CSharpDeveloper WHERE login = :login", CSharpDeveloper.class);
            csharpQuery.setParameter("login", login);
            CSharpDeveloper csharpDeveloper = csharpQuery.uniqueResult();
            if (csharpDeveloper != null) {
                return csharpDeveloper;
            }

            // Sprawdzenie tabeli DatabaseAnalyst
            Query<DatabaseAnalyst> dbQuery = session.createQuery("FROM DatabaseAnalyst WHERE login = :login", DatabaseAnalyst.class);
            dbQuery.setParameter("login", login);
            DatabaseAnalyst dbAnalyst = dbQuery.uniqueResult();
            if (dbAnalyst != null) {
                return dbAnalyst;
            }

            // Sprawdzenie tabeli FrontEndDeveloper
            Query<FrontEndDeveloper> frontEndQuery = session.createQuery("FROM FrontEndDeveloper WHERE login = :login", FrontEndDeveloper.class);
            frontEndQuery.setParameter("login", login);
            FrontEndDeveloper frontEndDeveloper = frontEndQuery.uniqueResult();
            if (frontEndDeveloper != null) {
                return frontEndDeveloper;
            }

            // Sprawdzenie tabeli PythonDeveloper
            Query<PythonDeveloper> pythonQuery = session.createQuery("FROM PythonDeveloper WHERE login = :login", PythonDeveloper.class);
            pythonQuery.setParameter("login", login);
            PythonDeveloper pythonDeveloper = pythonQuery.uniqueResult();
            if (pythonDeveloper != null) {
                return pythonDeveloper;
            }

            transaction.commit();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }

        return null;
    }

    public static boolean checkSignIn(String username, String password) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            Query<Employee> query = session.createQuery("FROM Employee");
            List<Employee> resultList = query.getResultList();
            Optional<Employee> user = resultList.stream().filter(e -> e.getLogin().equals(username) && e.getPassword().equals(password)).findFirst();
            transaction.commit();

            if (user.isEmpty()) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            sessionFactory.close();
        }
    }

}
