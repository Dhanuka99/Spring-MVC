package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/
//Other class which is not belongs to us
public class DBConnection implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public DBConnection() {
        System.out.println("DB Connection Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("DB Connection Bean Name Aware");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("DB Connection Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("DB Connection Application Context Aware");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("DB Connection Initializing Bean");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("DB Connection Disposable Bean");
    }
}
