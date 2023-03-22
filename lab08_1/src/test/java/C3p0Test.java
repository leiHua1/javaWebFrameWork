import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import personal.leihua.dao.impl.DeptDaoImpl;
import personal.leihua.pojo.Dept;

import java.util.List;

/**
 * @Author leiHua
 * @Date 2023/3/22 13:05
 */
public class C3p0Test {
    String xmlPath= "c3p0/beans-c3p0.xml";
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
    JdbcTemplate jdTemplate =applicationContext.getBean("jdbcTemplate",JdbcTemplate.class);
    DeptDaoImpl deptDao = applicationContext.getBean(DeptDaoImpl.class);
    @Test
    public void findAllDeptTest(){
        List<Dept> allDepts = deptDao.findAllDepts();
        allDepts.forEach(System.out::println);
    }
}
