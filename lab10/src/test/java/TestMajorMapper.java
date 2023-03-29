import cn.edu.seig.dao.MajorDao;
import cn.edu.seig.dao.impl.MajorDaoImpl;
import cn.edu.seig.pojo.Major;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author leiHua
 * @Date 2023/3/29 12:57
 */
public class TestMajorMapper {
    ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
    MajorDao majorDao = (MajorDao)ac.getBean("majorDao");

    @Test
    public void testSelect(){
        Major majorById = majorDao.findMajorById("01");
        System.out.println(majorById);
    }
    @Test
    public void testSelectAll(){
        List<Major> allMajor = majorDao.findAllMajor();
        for (Major major : allMajor) {
            System.out.println(major);
        }
    }
    @Test
    public void testAdd(){
        Major major = new Major();
        major.setMajorId("300");
        major.setMajorName("洗洗睡吧专业");
        major.setTuition(26000);
        major.setDeptId(401);
        int result = majorDao.addMajor(major);
        System.out.println(result>0 ? "添加成功":"添加失败");
    }
    @Test
    public void testUpdate(){
        Major major = new Major();
        major.setMajorId("300");
        major.setMajorName("洗洗睡吧专业11");
        major.setTuition(26000);
        major.setDeptId(401);
        int result = majorDao.updateMajor(major);
        System.out.println(result>0 ? "修改成功":"修改失败");
    }
    @Test
    public void testdelete(){
        int result = majorDao.deleteMajorById("300");
        System.out.println(result>0 ? "删除成功":"删除失败");
    }
}
