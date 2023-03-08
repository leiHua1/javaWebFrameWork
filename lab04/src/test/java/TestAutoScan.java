import cn.edu.seig.service.impl.FreshmanServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author leiHua
 * @Date 2023/3/8 13:09
 */
public class TestAutoScan {
    @Test
    public void testScan(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        FreshmanServiceImpl bean = (FreshmanServiceImpl) ac.getBean("freshmanServiceImpl");
        System.out.println(bean);
    }
}
