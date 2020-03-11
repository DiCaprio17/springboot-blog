package com.hnz.blog.dao;

import com.hnz.blog.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author huangnuozhong
 * @create 2020-02-26-16:32
 */
public interface TypeRepository extends JpaRepository<Type, Long> {

    Type findByName(String name);

    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}