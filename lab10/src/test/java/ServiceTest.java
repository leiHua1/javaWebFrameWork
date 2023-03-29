import cn.edu.seig.mapper.MajorMapper;
import cn.edu.seig.pojo.Major;
import cn.edu.seig.service.MajorService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author leiHua
 * @Date 2023/3/29 14:00
 */
public class ServiceTest {
    ApplicationContext ac =new ClassPathXmlApplicationContext("spring-bean2.xml");
//    MajorMapper majorDao= (MajorMapper) ac.getBean("majorMapper");
    MajorService majorService= (MajorService) ac.getBean("majorServiceImpl");
    @Test
    public  void testSelect(){
        Major major = majorService.selectMajorById("01");
        System.out.println(major);
    }

    @Test
    public void testInsert(){
        Major major = new Major();
        major.setMajorId("500");
        major.setMajorName("测试事务异常是否回滚");
        major.setTuition(26000);
        major.setDeptId(401);
        int result = majorService.addMajor(major);
        System.out.println(result>0 ? "添加成功":"添加失败");
    }
    @Test
    public void testSelectAll(){
        List<Major> majors = majorService.selectAllMajor();
        for (Major major : majors) {
            System.out.println(major);
        }
    }
}
