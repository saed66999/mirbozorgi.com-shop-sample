package com.mirbozorgi.shop.business.service;

import com.mirbozorgi.shop.business.domain.CommentInfo;
import java.util.List;

public interface CommentService {

  CommentInfo add(
      String content,
      long creationDate,
      String userEmail,
      int productId);

  CommentInfo update(int id, String content);

  CommentInfo get(int commentId);

  void delete(int commentId);

  List<CommentInfo> getAll(Integer userId);

}
