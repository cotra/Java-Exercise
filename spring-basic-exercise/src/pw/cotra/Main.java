package pw.cotra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pw.cotra.aoptest.Student;
import pw.cotra.editor.TextEditor;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Student student = (Student) context.getBean("student");
//        student.getName();
//        student.getAge();
        student.printThrowException();
    }
}
