package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/

//@Component
public class SpringBean2 {

    public SpringBean2() {
        System.out.println("Spring Bean 2 Instantiated");
    }


    public void test(){
        System.out.println("Method Test 2 Invoked");
    }

}
