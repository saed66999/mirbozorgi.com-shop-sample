package com.mirbozorgi.shop.core.repository;

import com.mirbozorgi.shop.core.entity.Product;
import java.util.List;

public interface ProductRepository {

  Product add(Product product);

  Product update(
      int productId,
      String name,
      String price,
      String currency,
      String productImageUrl);

  Product get(int productId);

  void delete(int productId);

  List<Product> getAll(
      String name,
      Integer minPrice,
      Integer maxPrice,
      Integer minRate,
      Integer maxRate);

  void changeSumOfRate(
      int id,
      int changeRate);

}
