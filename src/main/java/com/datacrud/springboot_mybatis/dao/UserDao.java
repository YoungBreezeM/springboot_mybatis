package com.datacrud.springboot_mybatis.dao;

import com.datacrud.springboot_mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    @Select("select * from user")
    List<User> findAll();
}
