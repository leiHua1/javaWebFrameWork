import cn.edu.seig.pojo.Freshman;
import cn.edu.seig.service.impl.FreshmanServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class TestSpring {

    //1.初始化spring容器，加载配置文件
    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("applicationContext.xml");
    //2.通过容器获取FreshmanServiceImpl类的实例对象
    FreshmanServiceImpl freshmanService = (FreshmanServiceImpl) applicationContext.getBean("freshmanDao");

    //日期格式化
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");

    /**
     * (1)根据准考证号、身份证号和学号，查询新生信息
     */
    @Test
        public void selectFreshmanByMultipleTest() {
        //创建Freshman对象的Map集合，封装需要组合查询的条件
        HashMap<String, Object> params = new HashMap<String, Object>();
        //params.put("ticketNumber", "");
        params.put("idCard", "445122199610045953");
        params.put("stuNo", "2040706101");
        //执行SqlSession的查询方法，返回结果集
        List<Freshman> f = freshmanService.selectFreshmanByMultiple(params);
        //打印输出结果
        for(Freshman ff:f)
            //打印输出结果
            System.out.println(ff.toString());
        }
    /**
     * (2)根据准考证号和身份证号进行登录验证
     */
    @Test
    public void getFreshmanLoginTest(){
        String ticketNumber="16445122105383";
        String idCard="445122199610045953";
        //执行SqlSession的查询方法，返回结果集
        Freshman f = freshmanService.getFreshmanLogin(ticketNumber,idCard);
        //打印输出结果
        System.out.println(f.toString());
     }

   /**
     * (3)根据<foreach>元素，批量查询新生信息--List
     */
    @Test
    public void findFreshmanByDeptIdsAsListTest(){
        //创建List集合，封装查询的dept_id
        List<Integer> ids=new ArrayList<Integer>();
        ids.add(401);
        ids.add(402);
        ids.add(403);
        ids.add(404);
        ids.add(405);
        ids.add(406);
        //执行SqlSession的查询方法，返回结果集
        List<Freshman>  freshmans = freshmanService.findFreshmanByDeptIdsAsList(ids);
        //输出查询结果信息
        for (Freshman f : freshmans) {
            // 打印输出结果
            System.out.println(f.toString());
        }
    }
    /**
     * (4)根据<foreach>元素，批量查询新生信息--Array
     */
    @Test
    public void findFreshmanByDeptIdsAsArrayTest(){
        //创建Array集合，封装查询的dept_id
        Integer[] ids= {401,402,403,404,405};
        //执行SqlSession的查询方法，返回结果集
        List<Freshman>  freshmans =freshmanService.findFreshmanByDeptIdsAsArray(ids);
        //输出查询结果信息
        for(Freshman f : freshmans) {
            //打印输出结果
            System.out.println(f.toString());
        }
    }

    /**
     * (5)添加新生信息
     */
    @Test
    public void addFreshmanTest() {
        Freshman f=new Freshman();
        f.setIdCard("333");
        f.setTicketNumber("333");
        f.setName("sm");
        f.setSex(0);
        f.setAge(30);
        f.setBirthday(new Date(1990-11-26));
        f.setNation("汉");
        /*f.setPolitic(2);
        f.setDeptId(407);
        f.setMajorId("06");
        f.setClassId(01);
        f.setDormId(11);
        f.setRoleId(5);
        f.setUserId(24);
        f.setStuNo("2140706000");*/
        f.setRegisterTime(formatter.format(new Date()));
        f.setStatus(0);
        freshmanService.addFreshman(f);
    }
    /**
     * (6)修改新生信息
     */
    @Test
    public void updateFreshmanTest() {
        Freshman f=new Freshman();
        f.setIdCard("333");
        f.setTicketNumber("333");
        f.setName("wjh");
        f.setSex(0);
        f.setAge(31);
        f.setNation("汉族");
        freshmanService.updateFreshman(f);
        //打印输出结果
        /*if(rows>0)
        System.out.println(rows+"条新生信息更新成功！");
        else System.out.println("新生信息更新失败！");*/
   }

    /**
     * (7)删除新生信息
     */
    @Test
    public void deleteFreshmanTest() {
        //创建Freshman对象的Map集合，封装需要组合查询的条件
        HashMap<String, Object> params = new HashMap<String, Object>();
        //params.put("ticketNumber", "");
        params.put("idCard", "1");
        params.put("stuNo", "1");
        freshmanService.deleteFreshman(params);
        /*if(rows>0)System.out.println(rows+"条新生信息删除成功！");
        else System.out.println("新生信息删除失败！");*/
    }

}