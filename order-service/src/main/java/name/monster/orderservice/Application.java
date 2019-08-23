package name.monster.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: Application
 * @Description: 订单服务启动类
 * @Author miaopeng
 * @Date 2019-08-23 16:03:01
 **/

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
// 开启断路器监控
@EnableHystrixDashboard
// 服务熔断
@EnableCircuitBreaker
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
