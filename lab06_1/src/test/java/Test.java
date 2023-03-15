import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.seig.action.PersonAction;

public class Test {
	public static void main(String[] args){
		//得到Spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		PersonAction userAction=(PersonAction) context.getBean("personAction");
		String result=userAction.execute();
	}

}
