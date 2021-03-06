package com.example.myproject.repository.comment;

import com.example.myproject.model.entity.comment.Comment;
import com.example.myproject.model.entity.post.Post;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByPostOrderByGroupNum(Post post, Pageable page);
}
