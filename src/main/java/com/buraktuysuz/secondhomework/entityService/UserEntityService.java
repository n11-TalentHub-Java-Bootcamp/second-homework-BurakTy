package com.buraktuysuz.secondhomework.entityService;

import com.buraktuysuz.secondhomework.dao.UserDao;
import com.buraktuysuz.secondhomework.dto.UserCommentDto;
import org.springframework.stereotype.Service;

@Service
public class UserEntityService {

    private UserDao userDao;
    public UserEntityService(UserDao userDao) { this.userDao=userDao; }

//    public List<UserCommentDto> findUserComment(Long userId){
//       return userDao.findUserCommentDto(userId);
//    }
}
