package lk.ijse.spring.config;

import lk.ijse.spring.bean.DBConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {

    //another way of specifying a bean to the container
    //generate bean id from bean method name
    //we can chanage id as we want by passing a value to @bean annotation
//    @Bean("db")
    //@Scope("prototype")
    public DBConnection dbConnection(){
        return new DBConnection();
    }


}
