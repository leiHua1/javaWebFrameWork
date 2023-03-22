import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import personal.leihua.dao.impl.DeptDaoImpl;
import personal.leihua.pojo.Dept;

import java.util.List;

/**
 * @Author leiHua
 * @Date 2023/3/22 12:17
 */
public class DeptDaoTest {
    String xmlPath= "JdbcTemplateBeans.xml";
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
    JdbcTemplate jdTemplate =applicationContext.getBean("jdbcTemplate",JdbcTemplate.class);
    DeptDaoImpl deptDao = applicationContext.getBean(DeptDaoImpl.class);

    @Test
    public void findAllDeptTest(){
        List<Dept> allDepts = deptDao.findAllDepts();
        allDepts.forEach(System.out::println);
    }
    @Test
    public void addTest(){
        Dept dept = new Dept(123456, "玛卡巴卡");
        int result = deptDao.addDept(dept);
        System.out.println(result>0?"添加成功":"添加失败");
    }
    @Test
    public void updateTest() throws InterruptedException {
        int result = deptDao.updateDept(new Dept(412, "唔西迪西"));
        System.out.println(result>0?"修改成功":"修改失败");
    }
    @Test
    public void selectByIdTest() throws InterruptedException {
        Dept deptById = deptDao.findDeptById("401");
        System.out.println(deptById);
    }
    @Test
    public void deleteTest() throws InterruptedException {
        int result = deptDao.deleteDeptById("123456");
        System.out.println(result>0?"删除成功":"删除失败");
    }

}
