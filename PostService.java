package com.example.travelblog.services;

import com.example.travelblog.domain.Post;
import com.example.travelblog.domain.User;
import com.example.travelblog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public List<Post> getAllPosts(){return postRepository.findAllPosts();}

    public void createPost(Post post){ postRepository.saveNewPost(post);
    }
    public Post getPostById(int post_id){return postRepository.getOneById(post_id);}

    public List<Post> getPostByUser(int user_id){return postRepository.getPostsByUser(user_id);


    }

}
