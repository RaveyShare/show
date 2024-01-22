package ravey.show.spring.mvc.dispatcher;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;

/**
 * DispatcherServlet
 *
 * @author Ravey
 * @date 2024/01/19
 */
@Slf4j
public class DispatcherServletDemo {
    public static void main(String[] args) {
        AnnotationConfigServletWebServerApplicationContext context =
                new AnnotationConfigServletWebServerApplicationContext(WebConfig.class);
    }
}
