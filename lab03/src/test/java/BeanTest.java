import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author leiHua
 * @Date 2023/3/6 16:41
 */

public class BeanTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object dept = ac.getBean("dept");
        Object major1 = ac.getBean("major1");
        Object major2 = ac.getBean("major2");
        Object clazz = ac.getBean("c");
        System.out.println(dept);
        System.out.println(major1);
        System.out.println(major2);
        System.out.println(clazz);

    }
    @Test
    public  void test02(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean-ns.xml");
        Object dept = ac.getBean("dept");
        Object major1 = ac.getBean("major");
        Object clazz = ac.getBean("c");
        System.out.println(dept);
        System.out.println(major1);
        System.out.println(clazz);

    }

}
