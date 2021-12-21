package com.buraktuysuz.secondhomework.dto;

import java.math.BigDecimal;

public class ProductCommentCountDto {

    private Long productId;
    private String productName;
    private BigDecimal productPrice;
    private Long commentCount;

    public ProductCommentCountDto(){}

    public ProductCommentCountDto(Long productId, String productName, BigDecimal productPrice, Long commentCount) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.commentCount = commentCount==0?null:commentCount;
    }

    // Getter Setter Metotlar

    public Long getProductId() { return productId; }
    public void setProductId(Long productId) { this.productId = productId; }

    public String getProductName() {  return productName;  }
    public void setProductName(String productName) { this.productName = productName; }

    public BigDecimal getProductPrice() { return productPrice; }
    public void setProductPrice(BigDecimal productPrice) { this.productPrice = productPrice; }

    public Long getCommentCount() { return commentCount; }
    public void setCommentCount(Long commentCount) { this.commentCount = commentCount; }

    @Override
    public String toString() {
        return "ProductCommentCountDto{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", commentCount=" + commentCount +
                '}';
    }
}
