package lk.ijse.spring.config;

import lk.ijse.spring.bean.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.registerShutdownHook();
        ctx.refresh();

        Boy boy = ctx.getBean(Boy.class);
        boy.chatWithGirl();


    }
}
