package com.example.travelblog.repository;

import com.example.travelblog.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> findAllUsers(){

        return jdbcTemplate.query("select * from user", new UserRowMapper());
    }

    public User findOneUser(int id){
        String mySql = "select * from user  where user_id = ?";
        User u =  jdbcTemplate.queryForObject(mySql, new UserRowMapper(), id );
        return u;
    }

    public List<User> getUsersByPost(int user_id){
        String mySql = "select * from user  where post = ?";
        List<User> users =  jdbcTemplate.query(mySql, new UserRowMapper(), user_id );

        return users;
    }

    public void updateUserFirstName(String firstName, int user_id){
        String mySql = "update user set firstName = ? where user_id = ?";
        jdbcTemplate.update(mySql, firstName, user_id);
    }

    private class UserRowMapper implements RowMapper<User>
    {
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setUser_id(rs.getInt("user_id"));
            user.setFirstName(rs.getString("firstName"));
            user.setLastName(rs.getString("lastName"));
           // user.setEmail(rs.getString("email"));
            return user;
        }
    }
}
