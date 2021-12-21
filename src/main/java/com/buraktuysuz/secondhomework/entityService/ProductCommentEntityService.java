package com.buraktuysuz.secondhomework.entityService;

import com.buraktuysuz.secondhomework.dao.ProductCommentDao;
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

    public ProductComment save(ProductComment comment){
        comment = productCommentDao.save(comment);

        return comment;
    }
}
