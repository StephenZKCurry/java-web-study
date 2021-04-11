package com.zhukai.feign.feign.impl;

import com.zhukai.feign.entity.User;
import com.zhukai.feign.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Feign容错处理
 *
 * @author zhukai
 * @date 2021/4/11
 */
@Component
public class FeignError implements FeignProviderClient {

    @Override
    public List<User> findAllUser() {
        System.out.println("服务器维护中...");
        return null;
    }

    @Override
    public User findUserById(String id) {
        System.out.println("服务器维护中...");
        return null;
    }

    @Override
    public void addUser(User user) {
        System.out.println("服务器维护中...");
    }

    @Override
    public void updateUser(User user) {
        System.out.println("服务器维护中...");
    }

    @Override
    public void deleteUserById(String id) {
        System.out.println("服务器维护中...");
    }
}
