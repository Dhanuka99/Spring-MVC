package lk.ijse.spring.config;

import lk.ijse.spring.bean.SpringBean4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/
public class AppInitializer {

    //how to run a hooking process on java
//        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("System is about to shut down");
//                ctx.close(); //close the container just before the jvm is about to shut down
//            }
//        }));

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.registerShutdownHook();
        ctx.refresh();

        //class type
//        SpringBean bean1 = ctx.getBean(SpringBean.class);
//        SpringBean bean2 = ctx.getBean(SpringBean.class);
//        System.out.println(bean1);
//        System.out.println(bean2);


        //Request from bean id
        // class name -> first world first letter simple
//        SpringBean springBean1 = (SpringBean) ctx.getBean("a");//changed is
//        SpringBean1 springBean2 = (SpringBean1) ctx.getBean("springBean1"); //default id
//        System.out.println(springBean1);//same reference
//        System.out.println(springBean2);//same reference

////        ctx.close();
//        System.out.println("L "+springBean2);
//
//        SpringBean bean = ctx.getBean(SpringBean.class);


//        DBConnection bean1 = ctx.getBean(DBConnection.class);
//        DBConnection bean2 = ctx.getBean(DBConnection.class);
//        System.out.println(bean1);
//        System.out.println(bean2);


//        DBConnection dBConnection1 = (DBConnection) ctx.getBean("db");
//        DBConnection dBConnection2 = (DBConnection) ctx.getBean("db");
//        System.out.println(dBConnection1);
//        System.out.println(dBConnection2);

//
        SpringBean4 sb1 = ctx.getBean(SpringBean4.class);
        System.out.println(sb1);

        SpringBean4 sb2 = ctx.getBean(SpringBean4.class);
        System.out.println(sb2);



    }

}
