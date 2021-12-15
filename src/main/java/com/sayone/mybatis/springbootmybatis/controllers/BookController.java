package com.sayone.mybatis.springbootmybatis.controllers;

import com.sayone.mybatis.springbootmybatis.api.BookMapper;
import com.sayone.mybatis.springbootmybatis.model.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class BookController {

    @Autowired
    BookMapper bookMapper;

    @GetMapping("/books")
    public List<BookEntity> getAll(){

        return bookMapper.findAll();
    }
}
