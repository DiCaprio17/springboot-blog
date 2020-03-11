package com.hnz.blog.service;

import com.hnz.blog.po.Comment;

import java.util.List;

/**
 * @author huangnuozhong
 * @create 2020-03-04-23:00
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
