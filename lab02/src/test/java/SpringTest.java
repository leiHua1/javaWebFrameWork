import com.sun.javaws.jnl.RContentDesc;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import personal.leihua.lab02.pojo.Class;
import personal.leihua.lab02.pojo.Dept;
import personal.leihua.lab02.pojo.Major;

public class SpringTest {
    @Test
    public void testSpringBeanFactory(){
    //加载配置文件，实例化Spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //测试计算机系信息的注入情况
        Dept dept = context.getBean(Dept.class);
        System.out.println(dept.toString());

        //测试专业信息的注入情况
        Major major = context.getBean(Major.class);
        System.out.println(major.toString());

        //测试学习导师信息的注入情况
        Object teacher = context.getBean("teacher");
        System.out.println("导师："+teacher.toString());

        //测试辅导员信息的注入情况
        Object teacher1 = context.getBean("teacher2");
        System.out.println("导师："+teacher1.toString());

    //测试班级信息的注入情况
        Class clazz = context.getBean(Class.class);
        System.out.println(clazz);

    }

}
