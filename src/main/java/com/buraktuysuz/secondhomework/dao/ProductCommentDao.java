package com.buraktuysuz.secondhomework.dao;

import com.buraktuysuz.secondhomework.dto.ProductCommentDto;
import com.buraktuysuz.secondhomework.dto.UserCommentDto;
import com.buraktuysuz.secondhomework.entity.ProductComment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCommentDao extends CrudRepository<ProductComment, Long> {

    @Query(" select " +
            "new dto.UserCommentDto(comment.user.id, comment.user.firstName , comment.user.lastName ,comment.product.name," +
            "comment.comment,comment.commentDate ) " +
            " from ProductComment comment " +
            "where comment.user.id =?1")
    public List<UserCommentDto> findCommentByUserId(Long userId);


 @Query(" select " +
         " new dto.ProductCommentDto( comment.product.name,comment.product.category.name,comment.product.price," +
         "comment.user.firstName,comment.user.lastName,comment.user.phone,comment.comment,comment.commentDate) " +
         " from ProductComment comment "+
         " where comment.product.id = ?1 ")
    public List<ProductCommentDto> findCommentProdById(Long userId);



}
