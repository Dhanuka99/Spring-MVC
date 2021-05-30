package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/
//@Component
public class SpringBean3 {
//    public SpringBean3() {
//        System.out.println("Spring Bean Three Default Constructor");
//    }

    @Autowired(required = false)// select greediest constructor at the moment
    public SpringBean3(@Value("C001") String id, @Value("Kasun") String name,@Value("30") int age,@Value("Single") String state) {
        System.out.println("Spring Bean Three 4 Parameters");
    }


    @Autowired(required = false)
    public SpringBean3(@Value("C001") String id, @Value("Dasun") String name, @Value("Galle") String address,@Value("A") String a) {
        System.out.println("Spring Bean Three - 4-2 Parameters");
    }



}
