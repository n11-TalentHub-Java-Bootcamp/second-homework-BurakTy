package com.buraktuysuz.secondhomework.entityService;

import com.buraktuysuz.secondhomework.dao.ProductDao;
import com.buraktuysuz.secondhomework.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductEntityService {

    private ProductDao productDao;

    public ProductEntityService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public List<Product> findAll(){
        return (List<Product>) productDao.findAll();
    }

    public Product findById(Long id){
        Optional<Product> optionalProduct = productDao.findById(id);

        Product product = null;
        if (optionalProduct.isPresent()){
            product = optionalProduct.get();
        }
        return product;
    }

    public Product save(Product product){
        product = productDao.save(product);

        return product;
    }

    public void delete(Product product){
        productDao.delete(product);
    }

    public void deleteById(Long id){
        productDao.deleteById(id);
    }

    public long count(){
        return productDao.count();
    }
}
