import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import personal.leihua.pojo.Freshman;
import personal.leihua.service.FreshmanServiceImpl;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @Author leiHua
 * @Date 2023/2/28 12:39
 */
public class FreshManServiceTest {
    @Test
    public void testSelect(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FreshmanServiceImpl freshmanService = context.getBean(FreshmanServiceImpl.class);
        List<Freshman> allFreshman = freshmanService.findAllFreshman();
        for (Freshman freshman : allFreshman) {
            System.out.println(freshman);
        }
    }
    @Test
    public void  testAddFreshMan(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FreshmanServiceImpl freshmanService = context.getBean(FreshmanServiceImpl.class);
        Freshman freshman = new Freshman();
        freshman.setTicketNumber("20407063010000");
        freshman.setIdCard("445222199904254019");
        freshman.setName("玛卡巴卡");
        freshman.setSex(0);
        freshman.setAge(22);
        freshman.setBirthday(new Date());
        System.out.println(freshmanService.addFreshMan(freshman));
    }
    @Test
    public void testDelete(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FreshmanServiceImpl freshmanService = context.getBean(FreshmanServiceImpl.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("ticketNumber","18220802151131");
        int i = freshmanService.deleteFreshman(map);
        if (i>0){
            System.out.println("删除成功");
        }else{
            System.out.println(i);
        }
    }
    @Test
    public void update(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FreshmanServiceImpl freshmanService = context.getBean(FreshmanServiceImpl.class);
        List<Freshman> allFreshman = freshmanService.findAllFreshman();
        Freshman freshman = allFreshman.get(1);
        System.out.println(freshman);
        freshman.setAge(25);
        int result = freshmanService.updateFreshman(freshman);
        System.out.println(result);
    }

}
