package com.buraktuysuz.secondhomework.dto;

import java.util.Date;

// Ödev  -4 Kullanıcı ve yapmış olduğu yorumları Dto
public class UserCommentDto {

    private Long userId;
    private String userNameSurname;
    private String productName;
    private String comment;
    private Date commentDate;

    public UserCommentDto(){};

    public UserCommentDto(Long userId, String userFirsName,String userLastName, String productName, String comment, Date commentDate) {
        this.userId = userId;
        this.userNameSurname = userFirsName +" " + userLastName;
        this.productName = productName;
        this.comment = comment;
        this.commentDate = commentDate;
    }

    //Getter Setter metotlar

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserNameSurname() {
        return userNameSurname;
    }

    public void setUserNameSurname(String userNameSurname) {
        this.userNameSurname = userNameSurname;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    @Override
    public String toString() {
        return "UserCommentDto{" +
                "userId=" + userId +
                ", userNameSurname='" + userNameSurname + '\'' +
                ", productName='" + productName + '\'' +
                ", comment='" + comment + '\'' +
                ", commentDate=" + commentDate +
                '}';
    }
}
