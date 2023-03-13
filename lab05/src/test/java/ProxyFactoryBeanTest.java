import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import personal.dao.TeacherDao;

/**
 * @Author leiHua
 * @Date 2023/3/13 11:35
 */
public class ProxyFactoryBeanTest {

    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("application.xml");
        TeacherDao teacherdao = ac.getBean("teacherDaoProxy", TeacherDao.class);
        teacherdao.selectById();
        System.out.println("----------------");
        teacherdao.insert();
        System.out.println("----------------");
        teacherdao.update();
        System.out.println("----------------");
        teacherdao.delelt();
    }
}
