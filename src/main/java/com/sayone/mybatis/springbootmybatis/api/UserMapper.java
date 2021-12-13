package com.sayone.mybatis.springbootmybatis.api;

import com.sayone.mybatis.springbootmybatis.model.BookEntity;
import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    List<BookEntity> findAll();
}
