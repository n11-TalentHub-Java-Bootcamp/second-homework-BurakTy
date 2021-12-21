package com.buraktuysuz.secondhomework.entityService;

import com.buraktuysuz.secondhomework.dao.UserDao;
import com.buraktuysuz.secondhomework.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserEntityService {

    private UserDao userDao;
    public UserEntityService(UserDao userDao) { this.userDao=userDao; }

    public List<User> findAll() {
        return (List<User>) userDao.findAll();
    }
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
    public User findByPhone(String phone) {
        return userDao.findByPhone(phone);
    }

    public User findById(Long id){
        Optional<User> optionalProduct = userDao.findById(id);

        User user = null;
        if (optionalProduct.isPresent()){
            user = optionalProduct.get();
        }
        return user;
    }

    public void delete(User user) {
        userDao.delete(user);
    }

    public User save(User user) {
        user =userDao.save(user);;
        return user;
    }


    public void deleteById(Long id) {
        userDao.deleteById(id);
    }

    public long count() {
        return userDao.count();
    }

}
