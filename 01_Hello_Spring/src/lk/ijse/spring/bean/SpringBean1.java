package lk.ijse.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/

//@Component("a")
public class SpringBean1 implements DisposableBean {

    public SpringBean1() {
        System.out.println("Spring Bean 1 Instantiated");
    }

    public void test(){
        System.out.println("Method Test 1 Invoked");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean1 Disposable Bean");
    }
}
