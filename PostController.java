package com.example.travelblog.controller;

import com.example.travelblog.domain.Post;
import com.example.travelblog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/post/{post_id}")
    public Post findPostById(@PathVariable int post_id) {

        return postService.getPostById(post_id);
    }

    @PostMapping("posts")
    public ResponseEntity<?> createPost(@RequestBody Post post){
        postService.createPost(post);
        return ResponseEntity.status(HttpStatus.CREATED).body(post);
    }
}
