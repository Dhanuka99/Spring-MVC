package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : Sanu Vithanage
 * @since : 0.0.1
 **/
@Component
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpringBean4 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean4() {
        System.out.println("Spring Bean 4 Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean 4 Bean Name Aware");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean 4 Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean 4 Application Context Aware");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean 4 Initializing Bean");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean 4 Disposable Bean");
    }
}
