package com.jee.mapper;


import com.jee.po.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User getUser(String name);
    public int insertUser(User user);
}
