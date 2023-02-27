package com.example.marketplace.Services;

import com.example.marketplace.Entities.ProductComment;
import com.example.marketplace.Entities.Productlike;

import java.util.List;

public interface ForumService {
    public Productlike saveLike(Productlike productlike);
    public void deleteLikeById(Long idproductlike);

    public ProductComment saveComment(ProductComment productComment);
    public void deleteCommentById(Long idProductComment);
    public List<ProductComment> getCommentsByPostId(Long idProduit);

}
