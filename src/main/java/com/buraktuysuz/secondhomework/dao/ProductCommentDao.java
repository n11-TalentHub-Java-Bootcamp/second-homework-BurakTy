package com.buraktuysuz.secondhomework.dao;

import com.buraktuysuz.secondhomework.entity.ProductComment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCommentDao extends CrudRepository<ProductComment, Long> {

//    @Query(" select " +
//            "new dto.UserCommentDto(comment.user.id, comment.user.firstName , comment.user.lastName ,comment.product.name," +
//            "comment.comment,comment.commentDate ) " +
//            " from ProductComment comment " +
//            "where comment.user.id =?1")
//    public List<UserCommentDto> findUserCommentDto(Long userId);


}
