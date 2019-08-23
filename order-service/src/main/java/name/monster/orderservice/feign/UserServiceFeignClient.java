package name.monster.orderservice.feign;

import name.monster.commonentity.entity.User;
import name.monster.orderservice.feign.impl.UserServiceFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName: UserServiceFeignClient
 * @Description: TODO
 * @Author miaopeng
 * @Date 2019-08-23 16:09:33
 **/

@FeignClient(name = "user-service",fallback = UserServiceFeignHystrix.class)
public interface UserServiceFeignClient {

    @GetMapping("/users/{id}")
    User getUserInfo(@PathVariable("id") String id);
}
