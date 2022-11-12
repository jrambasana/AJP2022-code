
import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
   
    public class BeforeAdvisor implements MethodBeforeAdvice{
    
    @Override
    public void before(Method method, Object[] args, Object target)throws Throwable {  
        System.out.println("additional concern before actual logic");  
    }  
    
}
    

