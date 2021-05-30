package lk.ijse.spring.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/

@Component
@Primary
public class Girl2 implements GoodGirl{

    public Girl2() {
        System.out.println("Girl 2 Instantiated");
    }

    @Override
    public void chat(){
        System.out.println("G2 Hello There.. How are you..?");
    }
}
