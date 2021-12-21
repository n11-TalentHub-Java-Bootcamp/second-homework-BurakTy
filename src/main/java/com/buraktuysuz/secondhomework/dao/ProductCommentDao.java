package com.buraktuysuz.secondhomework.dao;

import com.buraktuysuz.secondhomework.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCommentDao extends CrudRepository<User, Long> {

//     Ödev  -4 Kullanıcı ve yapmış olduğu yorumları döndüren metot
//    public List<UserCommentDto> findUserCommentDto(Long userId) {
//        String sql = " select " +
//                " new dto.UserCommentDto(comment.user.id, comment.user.firstName , comment.user.lastName ,comment.product.name," +
//                "comment.comment,comment.commentDate ) " +
//                " from ProductComment comment " +
//                "where comment.user.id =:userId" ;
//
//        Query query = getCurrentSession().createQuery(sql);
//        query.setParameter("userId",userId);
//
//        return query.list();
//    }

}
