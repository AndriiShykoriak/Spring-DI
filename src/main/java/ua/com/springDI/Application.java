package ua.com.springDI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import ua.com.springDI.view.DI;

@ComponentScan
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        DI injection = context.getBean(DI.class);
        injection.printCarWithUser();
    }
}
