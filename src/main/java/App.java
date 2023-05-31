import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        applicationContext.getBean("helloworld");
        applicationContext.getBean("Cat");
        applicationContext.getBean("Cat");

        boolean result = applicationContext.getBean("helloworld") == (applicationContext.getBean("helloworld"));
        System.out.println(result);

        boolean result1 = applicationContext.getBean("Cat")==(applicationContext.getBean("Cat"));
        System.out.println(result1);






    }


}



