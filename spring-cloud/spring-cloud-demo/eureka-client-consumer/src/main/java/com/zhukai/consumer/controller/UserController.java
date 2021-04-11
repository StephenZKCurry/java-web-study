package com.zhukai.consumer.controller;

import com.zhukai.consumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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
    private RestTemplate restTemplate;

    private static final String SERVER_URL = "http://localhost:8010";

    @GetMapping("/findAll")
    public List<User> findAllUser() {
        ResponseEntity<List<User>> responseEntity = restTemplate.exchange(SERVER_URL + "/user/findAll", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<User>>() {
                });
        return responseEntity.getBody();
    }

    @GetMapping("/find/{id}")
    public User findUserById(@PathVariable("id") String id) {
        return restTemplate.getForObject(SERVER_URL + "/user/find/{id}", User.class, id);
    }

    @PostMapping("/add")
    public void addUser(User user) {
        restTemplate.postForObject(SERVER_URL + "/user/add", user, Void.class);
    }

    @PutMapping("/update")
    public void updateUser(User user) {
        restTemplate.put(SERVER_URL + "/user/update", user);
    }

    @DeleteMapping("delete/{id}")
    public void deleteUserById(@PathVariable("id") String id) {
        restTemplate.delete(SERVER_URL + "/user/delete/{id}", id);
    }
}
