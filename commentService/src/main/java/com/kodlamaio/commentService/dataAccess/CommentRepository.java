package com.kodlamaio.commentService.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.commentService.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, String> {

}
