import cn.edu.seig.pojo.Class;
import cn.edu.seig.service.ClassService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTest {
	// 获得spring容器，并操作
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-xml.xml");
	ClassService bean = (ClassService) context.getBean("classServiceImpl");
	//测试查询
	@Test
	public void findClassByNameTest(){
		List<Class> clazz = bean.findClassByName("20物联网1班");
		for (Class aClass : clazz) {
			System.out.println(aClass.toString());
		}
	}
    //测试添加
	@Test
	public void addClassTest(){
		Class aClass = new Class();
		aClass.setClass_name("洗洗睡吧");
		aClass.setClass_size(50);
		aClass.setClass_surplus(48);
		aClass.setMajor_id("06");
		aClass.setTutor_id("0008");
		aClass.setInstructor_id("0011");
		bean.addClass(aClass);
	}
	@Test
	public void findAllClassByDept(){
		List<Class> allClassByDept = bean.findAllClassByDept(407);
		System.out.println(allClassByDept);

	}
	@Test
	public void updateClass(){
		List<Class> clazz = bean.findClassByName("洗洗睡吧");
		Class c1 = clazz.get(0);
		c1.setBz("修改");
		bean.updateClass(c1);
	}

}
