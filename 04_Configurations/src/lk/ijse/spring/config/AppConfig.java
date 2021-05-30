package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/


@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
@Import({AppConfig2.class,AppConfig3.class})// selecting a main configuration class and import other configurations to it
//@ImportResource("classpath:abc.xml")
//@ImportResource("filepath:absolute-path.xml")
//@ImportResource({"classpath:a.xml","classpath:b.xml"})
public class AppConfig {


}
