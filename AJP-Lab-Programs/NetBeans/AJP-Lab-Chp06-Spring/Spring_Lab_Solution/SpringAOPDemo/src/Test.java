
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Test {
    public static void main(String[] args) {  
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
    A a=(A)context.getBean("proxy",A.class);
    a.m();  
//    System.out.println(a.a());
}  
    
}
