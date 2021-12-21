package com.buraktuysuz.secondhomework.controller;

import com.buraktuysuz.secondhomework.dto.UserDto;
import com.buraktuysuz.secondhomework.entity.User;
import com.buraktuysuz.secondhomework.entityService.UserEntityService;
import com.buraktuysuz.secondhomework.exception.UsernamePhoneNotMatchException;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserEntityService userEntityService;

    public UserController(UserEntityService userEntityService) {
        this.userEntityService = userEntityService;
    }

    @GetMapping("/")
    public List<User> findAllUser(){
        return userEntityService.findAll();
    }

    @GetMapping("/username/{username}")
    public User findByUsername(@PathVariable String username){
        var user =userEntityService.findByUsername(username);;
        return  user;
    }

    @GetMapping("/phone/{phone}")
    public User findByPhone(@PathVariable String phone){
        var user =userEntityService.findByPhone(phone);;
        return  user;
    }


    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        user =userEntityService.save(user);
        return user;
    }

    @DeleteMapping("/")
    public User deleteProductById(@RequestBody String username,@RequestBody String phone) {

        User user = userEntityService.findByUsername(username);
        if (user.getPhone() == phone) {
            throw new UsernamePhoneNotMatchException( username + "kullanıcı adı ile " + phone +" telefon bilgileri uyuşmamaktadır.");
        }
        userEntityService.deleteById(user.getId());
        return user;
    }

    @PutMapping("/")
    public User updateUser(@RequestBody User user){
        user =userEntityService.save(user);
        return user;
    }
}
