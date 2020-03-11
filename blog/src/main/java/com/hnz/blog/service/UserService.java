package com.hnz.blog.service;

import com.hnz.blog.po.User;

/**
 * @author huangnuozhong
 * @create 2020-02-25-16:17
 */
public interface UserService {
    User checkUser(String username, String password);
}
