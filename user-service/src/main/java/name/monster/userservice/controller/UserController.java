package name.monster.userservice.controller;

import name.monster.commonentity.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author miaopeng
 * @Date 2019-08-23 15:48:54
 **/
@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public User getUserInfo(@PathVariable String id){
        User user=new User();
        user.setId(id);
        user.setName("张三");
        user.setSex("男");
        user.setPhone("18612345678");
        user.setStatus(true);
        return user;
    }
}
