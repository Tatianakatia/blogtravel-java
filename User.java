package com.example.travelblog.domain;

import com.fasterxml.jackson.annotation.JsonSetter;

public class User {
    private int user_id;
    private String firstName;
    private String lastName;
//    private String email;
//    private String passwordHash;
//    private Date registeredAt ;
//    private Date lastLogin;
//    private String intro;
//    private String user_profile;
//
    public String getFirstName() {
    return firstName;
}

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", firstName='" + firstName + '\'' +
                ", post=" + post +
                '}';
    }




    private Post post;
    @JsonSetter("post")
    public void setPost(Post post) {
        this.post = post;
    }


    public void setPost_(int post_) {
        this.post_ = post_;
    }

    public Post getPost() {return post; }

    public int getPost_() {
        return post_;
    }

    private int post_;


}


