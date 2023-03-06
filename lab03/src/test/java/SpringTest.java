import cn.edu.seig.Class;
import cn.edu.seig.Dept;
import cn.edu.seig.Major;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    //加载配置文件，实例化Spring容器
    ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    //测试计算机系信息的注入情况
    @Test
    public void deptTest(){
        Dept dept = (Dept)ac.getBean("dept");
        dept.sayMajors();
    }

    //测试专业信息的注入情况
    @Test
    public void majorTest(){

        Major major = (Major)ac.getBean("major1");
        major.sayClasss();
    }

     //测试班级信息的注入情况
    @Test
    public void classTest(){

        Class c = (Class)ac.getBean("c");
        c.sayTeacherProp();
    }

}
