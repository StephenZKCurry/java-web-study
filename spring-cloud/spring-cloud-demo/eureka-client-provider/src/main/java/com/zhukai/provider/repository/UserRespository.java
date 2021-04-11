package com.zhukai.provider.repository;

import com.zhukai.provider.entity.User;

import java.util.List;

/**
 * 用户Respository接口
 *
 * @author zhukai
 * @date 2021/4/10
 */
public interface UserRespository {

    List<User> findAllUser();

    User findUserById(String id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(String id);
}
