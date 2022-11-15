import java.lang.reflect.Method;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice{

public void before(Method method, Object[] args, Object target)throws Throwable {  
    System.out.println("This is some additional concern BEFORE actual logic");  
}  

//    public void afterReturning(Object o, Method method, Object[] os, Object o1)throws Throwable {  
//        System.out.println("additional concern AFTER actual logic");  
//    }  
    
    
}
    

