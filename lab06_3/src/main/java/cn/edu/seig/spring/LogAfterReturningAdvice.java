package cn.edu.seig.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.text.DateFormat;
import java.util.Date;

/**
 * @Author leiHua
 * @Date 2023/3/15 19:53
 */
public class LogAfterReturningAdvice  implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        String className = target.getClass().getName();
        String methodName = method.getName();
        Date date = new Date();
        String curTime = DateFormat.getDateTimeInstance().format(date);
        String argStr="";
        for (Object arg : args) {
            argStr+=arg;
        }
        String logInfo = "【" + curTime + "】：" + className + "." + methodName + "("+argStr+")+"+ "方法被调用！";
        System.out.println(logInfo);

    }
}
