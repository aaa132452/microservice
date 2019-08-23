package name.monster.orderservice.feign.impl;

import name.monster.commonentity.entity.User;
import name.monster.orderservice.feign.UserServiceFeignClient;
import org.springframework.stereotype.Component;

/**
 * @ClassName: UserServiceFeignHystrix
 * @Description: TODO
 * @Author miaopeng
 * @Date 2019-08-23 16:26:51
 **/
@Component
public class UserServiceFeignHystrix implements UserServiceFeignClient {
    @Override
    public User getUserInfo(String id) {
        return null;
    }
}
