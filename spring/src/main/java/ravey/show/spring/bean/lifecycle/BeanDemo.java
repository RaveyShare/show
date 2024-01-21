package ravey.show.spring.bean.lifecycle;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Ravey
 * @date 2022/06/25
 */

public class BeanDemo {
    public static void main(String[] args) {

    }

    public BeanDemo() {
        System.out.println("==========================构造");
    }


    public void autowire(@Value("${user}") String home) {
        System.out.println("========================依赖注入" + home + ";");
    }

    @PostConstruct
    public void init() {
        System.out.println("==========================初始化");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("==========================销毁");
    }
}
