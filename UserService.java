package com.example.travelblog.services;

import com.example.travelblog.domain.Post;
import com.example.travelblog.domain.User;
import com.example.travelblog.repository.PostRepository;
import com.example.travelblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    public void updateUserFirstName(String firstName, int id){userRepository.updateUserFirstName(firstName, id);
    }

    public List<User> findAllUsers(){
        return userRepository.findAllUsers();
    }

    public List<User> getUsersByPost(int id){return userRepository.getUsersByPost(id);}

    public User findUserById(int id){
        User u = userRepository.findOneUser(id);
//        Post p = postRepository.getOneById(id);
//        u.setPost(p);
        System.out.println(u);
        return u;
    }

}
