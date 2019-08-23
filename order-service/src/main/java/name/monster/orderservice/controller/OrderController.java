package name.monster.orderservice.controller;

import name.monster.commonentity.entity.User;
import name.monster.orderservice.feign.UserServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: OrderController
 * @Description: TODO
 * @Author miaopeng
 * @Date 2019-08-23 16:06:54
 **/

@RestController
public class OrderController {

    @Autowired
    UserServiceFeignClient userServiceFeignClient;

    @PostMapping("/orders")
    public Map orderGoods(String userId, String goodsId) {
        User user = userServiceFeignClient.getUserInfo(userId);
        Map map = new HashMap();
        map.put("user", user);
        map.put("goodsId", goodsId);
        return map;
    }
}
