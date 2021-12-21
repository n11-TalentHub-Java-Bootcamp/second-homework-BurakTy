package com.buraktuysuz.secondhomework.entityService;

import com.buraktuysuz.secondhomework.dao.UserDao;
import com.buraktuysuz.secondhomework.dto.ProductCommentDto;
import org.springframework.stereotype.Service;

@Service
public class ProductCommentEntityService {

    private ProductCommentDto userDao;
    public ProductCommentEntityService(UserDao userDao) { this.userDao=userDao; }

//    public List<UserCommentDto> findUserComment(Long userId){
//       return userDao.findUserCommentDto(userId);
//    }
}
