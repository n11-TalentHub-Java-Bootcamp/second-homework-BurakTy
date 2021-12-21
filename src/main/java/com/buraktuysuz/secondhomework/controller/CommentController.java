package com.buraktuysuz.secondhomework.controller;

import com.buraktuysuz.secondhomework.entity.User;
import com.buraktuysuz.secondhomework.entityService.UserEntityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments/")
public class CommentController {

    private UserEntityService userEntityService;

    public CommentController(UserEntityService userEntityService) {
        this.userEntityService = userEntityService;
    }

    @GetMapping("")
    public List<User> findAllCategory(){
        return userEntityService.findAll();
    }

    @GetMapping("{username}")
    public User findByUsername(@PathVariable String username){
        var user =userEntityService.findByUsername(username);;
        return  user;
    }

    @GetMapping("{phone}")
    public User findByPhone(@PathVariable String phone){
        var user =userEntityService.findByPhone(phone);;
        return  user;
    }

//    @PutMapping("{id}")
//    public User saveCategory(@RequestBody User user,@PathVariable Long id){
//        return userEntityService.update(User,id);
//
//    }
//
//    @PutMapping("/")
//    public Category updateCategory(@RequestBody CategoryDto categoryDto){
//        Category category=  CategoryConverter.INSTANCE.convertCategoryDtoToCategory(categoryDto);
//        return categoryEntitySevice.save(category);
//    }
}
