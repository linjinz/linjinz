import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.Apple;
import spring.User;

public class Demo {
    //声明应用上下文对象  spring对象
    private ApplicationContext applicationContext;
/*    @Test
    public  void test(){
        System.out.println("Ok");
    }
    @Test
    public void test2()
    {
        applicationContext =new AnnotationConfigApplicationContext(spring.ShopMinche.class);
        System.out.println(applicationContext);
        Apple apple=(Apple)applicationContext.getBean("apple");
        apple.setName("苹果");
        System.out.println(apple.getName());
    }
    @Test
    public void test3()
    {
        applicationContext =new AnnotationConfigApplicationContext(spring.ShopMinche.class);
        System.out.println(applicationContext);
        Apple apple=(Apple)applicationContext.getBean("getApple");
        apple.setName("苹果");
        System.out.println(apple.getName());
    }*/
    @Before
    public void init()
    {
        applicationContext=new ClassPathXmlApplicationContext("Application.xml");

    }
    @Test
    public  void test1()
    {
      User user =  (User) applicationContext.getBean("user");
        System.out.println(user);

    }
}
