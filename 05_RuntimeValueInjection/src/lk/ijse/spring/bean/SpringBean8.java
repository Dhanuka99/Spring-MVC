package lk.ijse.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/
@Component
public class SpringBean8 implements InitializingBean {

    @Autowired
    Environment env;


    public SpringBean8() {
        System.out.println("Spring Bean 8 Instantiated");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        //System.getEnv()
        String user = env.getProperty("USER");
        System.out.println(user);

        //System.getProperties();
        String osName = env.getProperty("os.name");
        System.out.println(osName);

        //Resource Bundles
        String dbName = env.getProperty("user.db.name");
        System.out.println(dbName);

        //if we enter a invalid property key it returns a null
        String db = env.getProperty("user.db.names");
        System.out.println(db);//null

        //if we enter a invalid property key it returns a exception
        String userAddress = env.getRequiredProperty("user.addressy");//invalid key
        System.out.println(userAddress); //exception


    }
}
