package com.zhukai.feign.controller;

import com.zhukai.feign.entity.User;
import com.zhukai.feign.feign.FeignProviderClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户Controller
 *
 * @author zhukai
 * @date 2021/4/11
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public List<User> findAllUser() {
        return feignProviderClient.findAllUser();
    }

    @GetMapping("/find/{id}")
    public User findUserById(@PathVariable("id") String id) {
        return feignProviderClient.findUserById(id);
    }

    @PostMapping("/add")
    public void addUser(User user) {
        feignProviderClient.addUser(user);
    }

    @PutMapping("/update")
    public void updateUser(User user) {
        feignProviderClient.updateUser(user);
    }

    @DeleteMapping("delete/{id}")
    public void deleteUserById(@PathVariable("id") String id) {
        feignProviderClient.deleteUserById(id);
    }
}
