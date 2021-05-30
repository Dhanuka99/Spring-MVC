package lk.ijse.spring.config;

import lk.ijse.spring.bean.SpringBean2;
import lk.ijse.spring.bean.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {

    //full mode
    //if we define a bean method inside a configuration class its called as Full Mode
    //@Bean
    //public SpringBean2 springBean2(){
    //    return new SpringBean2();
    //}


//    Full Mode Further More
//    Bean methods
//    Satisfying inter-bean dependency invocation
/*
    @Bean
    public SpringBean2 springBean2(){
//        Inter-bean Dependency Invocation
        SpringBean3 springBean1 = springBean3();
        SpringBean3 springBean2 = springBean3();
        System.out.println(springBean1);
        System.out.println(springBean2);
        return new SpringBean2();
    }

    @Bean
    public SpringBean3 springBean3(){
        return new SpringBean3();
    }
*/





}
