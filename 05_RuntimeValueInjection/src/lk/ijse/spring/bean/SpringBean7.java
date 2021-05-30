package lk.ijse.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/
//@Component
public class SpringBean7 implements InitializingBean {
    //property place holders ${}
    //Resource Bundles
    @Value("${user.db.name}")
    String dbName;
    @Value("${user.address}")
    String address;
    @Value("${user.database.name}")
    String dbTwo;

    public SpringBean7() {
        System.out.println("Spring Bean 7 Instantiated");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(dbName);
        System.out.println(address);
        System.out.println(dbTwo);
    }
}
