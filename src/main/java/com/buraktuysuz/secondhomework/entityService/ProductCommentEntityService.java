package com.buraktuysuz.secondhomework.entityService;

import com.buraktuysuz.secondhomework.dao.ProductCommentDao;
import com.buraktuysuz.secondhomework.dto.ProductCommentDto;
import com.buraktuysuz.secondhomework.dto.UserCommentDto;
import com.buraktuysuz.secondhomework.entity.Product;
import com.buraktuysuz.secondhomework.entity.ProductComment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCommentEntityService {

    private ProductCommentDao productCommentDao;
    public ProductCommentEntityService(ProductCommentDao productCommentDao) { this.productCommentDao=productCommentDao; }

    public List<ProductComment> findAll(){
        return (List<ProductComment>) productCommentDao.findAll();
    }

    public ProductComment findById(Long id){
        Optional<ProductComment> optionalProductComment = productCommentDao.findById(id);

        ProductComment comment = null;
        if (optionalProductComment.isPresent()){
            comment = optionalProductComment.get();
        }
        return comment;
    }

    public List<UserCommentDto> findCommentByUserId(Long id){
        List<UserCommentDto> productCommentList = productCommentDao.findCommentByUserId(id);

        return productCommentList;
    }
    public List<ProductCommentDto> findCommentUserById(Long id){
        List<ProductCommentDto> productCommentDtoList = productCommentDao.findCommentProdById(id);

        return productCommentDtoList;
    }

    public ProductComment save(ProductComment comment){
        comment = productCommentDao.save(comment);

        return comment;
    }
    public void deleteById(Long id){
       productCommentDao.deleteById(id);
    }
}
