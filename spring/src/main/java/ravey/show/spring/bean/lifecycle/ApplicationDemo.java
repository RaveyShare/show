package ravey.show.spring.bean.lifecycle;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.annotation.ContextAnnotationAutowireCandidateResolver;
import org.springframework.context.support.GenericApplicationContext;

/**
 * TODO
 *
 * @author Ravey
 * @date 2022/06/25
 */
public class ApplicationDemo {
    public static void main(String[] args) {
        GenericApplicationContext applicationContext = new GenericApplicationContext();
        applicationContext.registerBean("beanDemo",BeanDemo.class);
        applicationContext.getDefaultListableBeanFactory().setAutowireCandidateResolver(new ContextAnnotationAutowireCandidateResolver());
        applicationContext.registerBean(AutowiredAnnotationBeanPostProcessor.class);
        applicationContext.registerBean(CommonAnnotationBeanPostProcessor.class);

        applicationContext.refresh();

        System.out.println(applicationContext.getBean(BeanDemo.class));
        applicationContext.close();
    }
}
