package name.monster.gatewayzuul;

import name.monster.gatewayzuul.filter.AuthenticationFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName: Application
 * @Description: TODO
 * @Author miaopeng
 * @Date 2019-08-23 16:56:58
 **/

@SpringBootApplication
@EnableZuulProxy
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
