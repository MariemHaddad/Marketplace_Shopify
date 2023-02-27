package com.example.marketplace.Services;

import com.example.marketplace.Entities.ProductComment;
import com.example.marketplace.Entities.Productlike;
import com.example.marketplace.Repositories.ProductCommentRepository;
import com.example.marketplace.Repositories.ProductlikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ForumServiceImpl implements ForumService {
    @Autowired
    ProductlikeRepository productlikeRepository;
    @Autowired
    ProductCommentRepository productCommentRepository;

    @Override
    public Productlike saveLike(Productlike productlike) {
        return productlikeRepository.save(productlike);
    }

    @Override
    public void deleteLikeById(Long idproductlike) {
        productlikeRepository.deleteById(idproductlike);

    }

    @Override
    public ProductComment saveComment(ProductComment productComment) {
        return productCommentRepository.save(productComment);
    }

    @Override
    public void deleteCommentById(Long idProductComment) {
        productCommentRepository.deleteById(idProductComment);

    }

    @Override
    public List<ProductComment> getCommentsByPostId(Long idProduit) {
        return null;
    }

}
