package lk.ijse.spring.config;

import lk.ijse.spring.bean.SpringBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/

@Configuration
public class AppConfig2 {

    @Bean
    public SpringBean2 springBean2() {
        return new SpringBean2();
    }
}
