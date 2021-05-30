package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/
//@Component
public class SpringBean2 {

//    public SpringBean2() {
//        System.out.println("Spring Bean two");
//    }

    public SpringBean2(@Value("C001") String id, @Value("Kasun,Dasun,Ruwan") String names[]) {
        System.out.println("Parameterised Constructor");
        for (String name : names) {
            System.out.println(name);
        }
    }


}
