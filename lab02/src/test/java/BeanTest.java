import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest{
	@Test
	public void beanTest(){
	// 以类加载路径下的beans.xml文件，创建Spring容器
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// 判断两次请求singleton作用域的Bean实例是否相等
		Object dept = context.getBean("dept");
		Object dept2 = context.getBean("dept");
		if (dept==dept2){
			System.out.println("singleton 实例相同");
		}else {
			System.out.println("singleton 实例不同");
		}
		// 判断两次请求prototype作用域的Bean实例是否相等
		Object major = context.getBean("major");
		Object major2 = context.getBean("major");
		if (major==major2){
			System.out.println(" prototype实例相同");
		}else {
			System.out.println("prototype 实例不同");
		}



	}
}
