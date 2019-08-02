package pw.cotra;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pw.cotra.editor.TextEditor;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor editor = (TextEditor) context.getBean("TextEditor");
        editor.spellCheck();
    }
}
