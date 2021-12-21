package com.buraktuysuz.secondhomework.converter;

import com.buraktuysuz.secondhomework.dto.NewProductCommentDto;
import com.buraktuysuz.secondhomework.entity.ProductComment;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductCommentConverter {

    ProductCommentConverter INSTANCE = Mappers.getMapper(ProductCommentConverter.class);

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "productId", source = "product.id")
    NewProductCommentDto convertProductCommentToNewProductCommentDto(ProductComment comment);

    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "product.id", source = "productId")
    ProductComment convertNewProductCommentDtoToProductComment(NewProductCommentDto newProductCommentDto);

    @AfterMapping()
    default void setNulls(@MappingTarget() final ProductComment productComment, NewProductCommentDto newProductCommentDto){
        if(newProductCommentDto.getProductId()==null){
            productComment.setProduct(null);
        }
        if(newProductCommentDto.getUserId()==null){
            productComment.setUser(null);
        }
    }

}
