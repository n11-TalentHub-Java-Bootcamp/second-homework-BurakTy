package com.buraktuysuz.secondhomework.dao;

import com.buraktuysuz.secondhomework.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {


    @Query("SELECT user FROM User user WHERE user.username = ?1")
    public User findByUsername(String emailAddress);

    @Query("SELECT user FROM User user WHERE user.phone = ?1")
    public User findByPhone(String phone);


}
