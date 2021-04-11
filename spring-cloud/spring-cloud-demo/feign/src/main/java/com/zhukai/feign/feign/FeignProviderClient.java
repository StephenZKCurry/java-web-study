package com.zhukai.feign.feign;

import com.zhukai.feign.entity.User;
import com.zhukai.feign.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Feign声明式接口
 *
 * @author zhukai
 * @date 2021/4/11
 */
// value指定要访问的服务名，fallback指定Feign的容错处理
@FeignClient(value = "server-provider", fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/user/findAll")
    List<User> findAllUser();

    @GetMapping("/user/find/{id}")
    User findUserById(@PathVariable("id") String id);

    @PostMapping("/user/add")
    void addUser(User user);

    @PutMapping("/user/update")
    void updateUser(User user);

    @DeleteMapping("/user/delete/{id}")
    void deleteUserById(@PathVariable("id") String id);
}
