package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/
//@Component
public class SpringBean3 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBean3() {
        System.out.println("Spring Bean3 Instantiated");
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean3 Bean Name Aware");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean3 Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean3 Application Context Aware");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean3 Initializing Bean");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean3 Disposable Bean");
    }
}
