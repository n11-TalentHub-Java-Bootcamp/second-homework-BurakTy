package com.buraktuysuz.secondhomework.controller;

import com.buraktuysuz.secondhomework.converter.ProductCommentConverter;
import com.buraktuysuz.secondhomework.dto.NewProductCommentDto;
import com.buraktuysuz.secondhomework.dto.ProductCommentDto;
import com.buraktuysuz.secondhomework.dto.UserCommentDto;
import com.buraktuysuz.secondhomework.entity.ProductComment;
import com.buraktuysuz.secondhomework.entity.User;
import com.buraktuysuz.secondhomework.entityService.ProductCommentEntityService;
import com.buraktuysuz.secondhomework.entityService.ProductEntityService;
import com.buraktuysuz.secondhomework.entityService.UserEntityService;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private UserEntityService userEntityService;
    private ProductEntityService productEntityService;
    private ProductCommentEntityService productCommentEntityService;

    public CommentController(UserEntityService userEntityService,ProductEntityService productEntityService,ProductCommentEntityService productCommentEntityService) {
        this.userEntityService = userEntityService;
        this.productEntityService = productEntityService;
        this.productCommentEntityService = productCommentEntityService;
    }

    @GetMapping("/")
    public List<User> findAll(){
        return userEntityService.findAll();
    }

//    @PostMapping("/users/{id}")
//    public List<UserCommentDto> findByUsername(@PathVariable Long id){

//        List<UserCommentDto>  userCommentDtos = userEntityService.findCommentByUsername(username);
//        if (userCommentDtos == null) {
//            User user = userEntityService.findByUsername(username);
//            throw new NotFoundException( "kullanıcı henüz bir yorum yazmamıştır");
//        }
//        return  userCommentDtos;
//    }

//    @GetMapping("/products/{id}")
//    public List<ProductCommentDto> findByPhone(@PathVariable Long id){
//
//        List<ProductCommentDto> productCommentDtoList = userEntityService.findCommentById(id);
//        if (productCommentDtoList == null) {
//            var product =productEntityService.findById(id);
//            throw new NotFoundException( product.getName() + "ürüne henüz bir yorum yazılmamıştır");
//        }
//        return  productCommentDtoList;
//    }

    @PostMapping("/")
    public ProductComment saveProductComment(@RequestBody NewProductCommentDto newProductCommentDto){
            ProductComment comment = ProductCommentConverter.INSTANCE.convertNewProductCommentDtoToProductComment(newProductCommentDto);
            comment = productCommentEntityService.save(comment);
            return  comment;
    }
}
