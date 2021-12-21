package com.buraktuysuz.secondhomework.controller;

import com.buraktuysuz.secondhomework.entityService.UserEntityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users/")
public class UserController {

    private UserEntityService userEntityService;

    public UserController(UserEntityService userEntityService) {
        this.userEntityService = userEntityService;
    }

//    @GetMapping("/")
//    public List<Category> findAllCategory(){
//        return userEntityService.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Category findCategoryById(@PathVariable Long id){
//        return categoryEntitySevice.findById(id);
//    }
//
//    @PostMapping("/")
//    public CategoryDto saveCategory(@RequestBody CategoryDto categoryDto){
//        Category category=  CategoryConverter.INSTANCE.convertCategoryDtoToCategory(categoryDto);
//        category =categoryEntitySevice.save(category);
//        return CategoryConverter.INSTANCE.convertCategoryToCategoryDto(category);
//    }
//
//    @PutMapping("/")
//    public Category updateCategory(@RequestBody CategoryDto categoryDto){
//        Category category=  CategoryConverter.INSTANCE.convertCategoryDtoToCategory(categoryDto);
//        return categoryEntitySevice.save(category);
//    }
}
