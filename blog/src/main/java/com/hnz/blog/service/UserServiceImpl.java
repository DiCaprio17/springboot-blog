package com.hnz.blog.service;

import com.hnz.blog.dao.UserRepository;
import com.hnz.blog.po.User;
import com.hnz.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huangnuozhong
 * @create 2020-02-25-16:17
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
