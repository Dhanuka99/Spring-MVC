package lk.ijse.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/
//@Component
public class SpringBean6 implements InitializingBean {
    //property place holders ${}
    //Java Properties Keys
    @Value("${user.country}")
    String country;
    @Value("${os.name}")
    String osname;

    public SpringBean6() {
        System.out.println("Spring Bean 6 Instantiated");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(country);
        System.out.println(osname);
    }
}
