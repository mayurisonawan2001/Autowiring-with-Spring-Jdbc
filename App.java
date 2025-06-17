package com.springjdbc;

import com.springjdbc.config.AppConfig;
import com.springjdbc.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        StudentDao dao = context.getBean(StudentDao.class);

        // Insert example
        Student student = new Student(202, "Reena", "Pune");
        dao.insert(student);

        System.out.println("Student inserted!");

        // Read all
        dao.getAllStudents().forEach(System.out::println);
    }
}
