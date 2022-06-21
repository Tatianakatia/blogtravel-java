package com.example.travelblog.repository;

import com.example.travelblog.domain.Post;
import com.example.travelblog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PostRepository {
    public Post getPostsByUser;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Post> findAllPosts(){
        return jdbcTemplate.query("select * from post", new PostRowMapper());
    }

    public Post getOneById(int id){
        String mySql = "select * from post  where user_id = ?";
        Post p =  jdbcTemplate.queryForObject(mySql, new PostRowMapper(), id);

        return p;
    }

    public void saveNewPost(Post post){
        String mySql = "insert into post(title, post_id) values (?,?)";
        int num = jdbcTemplate.update(mySql, post.getTitle(), post.getPost_id());
        System.out.println(num);
    }

    private class PostRowMapper implements RowMapper<Post>
    {
        public Post mapRow(ResultSet rs, int rowNum) throws SQLException {
            Post post = new Post();
            post.setPost_id(rs.getInt("post_id"));
            post.setTitle(rs.getString("title"));
            //post.setTeam_id(rs.getInt("team_id"));
            return post;
        }
    }
}
