package com.zhukai.provider.repository.impl;

import com.zhukai.provider.entity.User;
import com.zhukai.provider.repository.UserRespository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户Respository实现类
 *
 * @author zhukai
 * @date 2021/4/10
 */
@Repository
public class UserRepositoryImpl implements UserRespository {

    private static final List<User> USER_LIST;

    static {
        USER_LIST = new ArrayList<>();
        USER_LIST.add(new User("1", "Stephen Curry", 33));
        USER_LIST.add(new User("2", "Klay Thompson", 32));
        USER_LIST.add(new User("3", "Draymond Green", 31));
    }

    @Override
    public List<User> findAllUser() {
        return USER_LIST;
    }

    @Override
    public User findUserById(String id) {
        for (User user : USER_LIST) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void addUser(User user) {
        USER_LIST.add(user);
    }

    @Override
    public void updateUser(User user) {
        for (User u : USER_LIST) {
            if (u.getId().equals(user.getId())) {
                u.setName(user.getName());
                u.setAge(user.getAge());
                break;
            }
        }
    }

    @Override
    public void deleteUserById(String id) {
        for (User u : USER_LIST) {
            if (u.getId().equals(id)) {
                USER_LIST.remove(u);
                break;
            }
        }
    }
}
