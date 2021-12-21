package com.buraktuysuz.secondhomework.dto;



import java.math.BigDecimal;
import java.util.Date;

public class ProductCommentDto {

    private String productName;
    private String categoryName;
    private BigDecimal price;
    private String userFirstName;
    private String userLastName;
    private String userPhone;
    private String comment;
    private Date commentDate;

    public ProductCommentDto() {
    }

    // ProductCommentDto Constructor metot , sql ifade de select sonucu için önemli
    public ProductCommentDto(String productName, String categoryName, BigDecimal price, String userFirstName, String userLastName, String userPhone, String comment, Date commentDate) {
        this.productName = productName;
        this.categoryName = categoryName;
        this.price = price;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userPhone = userPhone;
        this.comment = comment;
        this.commentDate = commentDate;
    }


    // Getter ve Setter Metotları
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName;  }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price;  }

    public String getUserFirstName() { return userFirstName; }
    public void setUserFirstName(String userFirstName) { this.userFirstName = userFirstName;  }

    public String getUserLastName() { return userLastName;  }
    public void setUserLastName(String userLastName) { this.userLastName = userLastName; }

    public String getUserPhone() { return userPhone;  }
    public void setUserPhone(String userPhone) { this.userPhone = userPhone; }

    public String getComment() { return comment; }

    public void setComment(String comment) { this.comment = comment; }

    public Date getCommentDate() { return commentDate; }

    public void setCommentDate(Date commentDate) { this.commentDate = commentDate; }

    @Override
    public String toString() {
        return "ProductCommentDto{" +
                "productName='" + productName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", price=" + price +
                ", userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", comment='" + comment + '\'' +
                ", commentDate=" + commentDate +
                '}';
    }
}
