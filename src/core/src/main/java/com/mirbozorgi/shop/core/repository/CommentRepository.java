package com.mirbozorgi.shop.core.repository;

import com.mirbozorgi.shop.core.entity.Comment;
import java.util.List;

public interface CommentRepository {

  Comment add(Comment comment);

  Comment update(int id, String content);

  Comment get(int commentId);

  void delete(int commentId);

  List<Comment> getAll(Integer userId);
}
