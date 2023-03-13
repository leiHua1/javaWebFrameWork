package personal.aspect;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * @Author leiHua
 * @Date 2023/3/13 11:18
 */
public class MyAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        checkPermissions();
        Object o = invocation.proceed();
        log();
        return o;
    }

    public void checkPermissions(){
        System.out.println("AOP前置实现教师权限认证");
    }

    public void log(){
        System.out.println("AOP后置实现日志输出");
    }
}
