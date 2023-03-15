import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.seig.spring.service.StudentService;

public class SpringAOPTest {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentService student = (StudentService)context.getBean("studentService");
		//以自己的学号和姓名为例，分别测试save、update和delete方法
		//student.save("2040706000", "孙南");
		student.save("2040706301","雷诏华");
		student.delete("2040706301");
		student.update("123","玛卡巴卡");

	}

}
