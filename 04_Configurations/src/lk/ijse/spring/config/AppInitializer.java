package lk.ijse.spring.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        //register all configurations to the context
        ctx.register(AppConfig.class);
//        ctx.register(AppConfig2.class);
//        ctx.register(AppConfig3.class);

        ctx.refresh();
        ctx.registerShutdownHook();

    }

}
