package com.buraktuysuz.secondhomework.entityService;

import com.buraktuysuz.secondhomework.dao.ProductCommentDao;
import org.springframework.stereotype.Service;

@Service
public class ProductCommentEntityService {

    private ProductCommentDao productCommentDao;
    public ProductCommentEntityService(ProductCommentDao productCommentDao) { this.productCommentDao=productCommentDao; }

}
