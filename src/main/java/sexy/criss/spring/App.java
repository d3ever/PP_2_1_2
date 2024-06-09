package sexy.criss.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sexy.criss.spring.model.Cat;
import sexy.criss.spring.model.HelloWorld;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld hw = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld hw2 = applicationContext.getBean("helloworld", HelloWorld.class);

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);

        System.out.println(hw == hw2);
        System.out.println(cat1 == cat2);
    }
}