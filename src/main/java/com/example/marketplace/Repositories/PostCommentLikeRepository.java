package com.example.marketplace.Repositories;

import com.example.marketplace.Entities.PostCommentLike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCommentLikeRepository extends CrudRepository<PostCommentLike,Long> {
}
