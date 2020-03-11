package com.hnz.blog.dao;

import com.hnz.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author huangnuozhong
 * @create 2020-02-25-16:20
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);
}
