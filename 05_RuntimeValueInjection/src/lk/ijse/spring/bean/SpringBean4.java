package lk.ijse.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/
//@Component
public class SpringBean4 implements InitializingBean {

    @Value("Dasun Hansaka")
    String name;


    public SpringBean4() {
        System.out.println("Spring Bean 4 Instantiated");
        System.out.println(name);//bean not initialized yet.. so this is null
    }


    //this method is called after bean is ready
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);// so this print the name Dasun Hansaka
    }
}
