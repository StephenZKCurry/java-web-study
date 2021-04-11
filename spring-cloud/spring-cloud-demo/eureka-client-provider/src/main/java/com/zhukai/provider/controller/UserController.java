package com.zhukai.provider.controller;

import com.zhukai.provider.entity.User;
import com.zhukai.provider.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户Controller
 *
 * @author zhukai
 * @date 2021/4/10
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRespository userRespository;

    /** 服务启动端口号 */
    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index() {
        return "当前端口：" + port;
    }

    @GetMapping("/findAll")
    public List<User> findAllUser() {
        return userRespository.findAllUser();
    }

    @GetMapping("/find/{id}")
    public User findUserById(@PathVariable("id") String id) {
        return userRespository.findUserById(id);
    }

    @PostMapping("/add")
    public void addUser(User user) {
        userRespository.addUser(user);
    }

    @PutMapping("/update")
    public void updateUser(User user) {
        userRespository.updateUser(user);
    }

    @DeleteMapping("delete/{id}")
    public void deleteUserById(@PathVariable("id") String id) {
        userRespository.deleteUserById(id);
    }
}
