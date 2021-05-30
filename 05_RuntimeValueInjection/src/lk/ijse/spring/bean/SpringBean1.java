package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/
//@Component
public class SpringBean1 {

//    public SpringBean1() {
//        System.out.println("Default Constructor");
//    }

    public SpringBean1(@Value("C001") String id,@Value("Kamal") String name,@Value("22") int age) {
        System.out.println("Spring Bean One");
        System.out.println(id+ " "+name+" "+age);
    }



}
