package com.example.travelblog.domain;

// import java.util.Date;

import com.example.travelblog.repository.PostRepository;
import com.example.travelblog.repository.UserRepository;

import java.util.List;

public class Post {
    private int post_id;
    private String title;

//    private String metaTitle;
//    private String slug;
//    private String summary;
//    private String published;
//    private Date createdAt;
//    private Date updatedAt;
//    private Date publishedAt;
//    private String content;
    private int user_id;
//
    public int getPost_id() {
        return post_id;
    }

    public String getTitle() {
        return title;
    }
//
//    public String getMetaTitle() {
//        return metaTitle;
//    }
//
//    public String getSlug() {
//        return slug;
//    }
//
//    public String getSummary() {
//        return summary;
//    }
//
//    public String getPublished() {
//        return published;
//    }
//
//    public Date getCreatedAt() {
//        return createdAt;
//    }
//
//    public Date getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public Date getPublishedAt() {
//        return publishedAt;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }
        public void setTitle(String title) {
        this.title = title;
    }
//

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
//

//
//    public void setMetaTitle(String metaTitle) {
//        this.metaTitle = metaTitle;
//    }
//
//    public void setSlug(String slug) {
//        this.slug = slug;
//    }
//
//    public void setSummary(String summary) {
//        this.summary = summary;
//    }
//
//    public void setPublished(String published) {
//        this.published = published;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public void setUpdatedAt(Date updatedAt) {
//        this.updatedAt = updatedAt;
//    }
//
//    public void setPublishedAt(Date publishedAt) {
//        this.publishedAt = publishedAt;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//


    @Override
    public String toString() {
        return "Post{" +
                "post_id=" + post_id +
                ", title='" + title + '\'' +
                '}';
    }
}
