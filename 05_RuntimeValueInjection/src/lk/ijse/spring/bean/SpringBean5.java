package lk.ijse.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/
//@Component
public class SpringBean5 implements InitializingBean {
    //property place holders ${}
    //Environment variables Keys
    @Value("${USER}")
    String user;
    @Value("${GDMSESSION}")
    String gdmsession;

    public SpringBean5() {
        System.out.println("Spring Bean 5 Instantiated");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(user);
        System.out.println(gdmsession);
    }
}
