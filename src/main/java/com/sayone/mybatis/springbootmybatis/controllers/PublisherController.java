package com.sayone.mybatis.springbootmybatis.controllers;

import com.sayone.mybatis.springbootmybatis.api.PublisherMapper;
import com.sayone.mybatis.springbootmybatis.model.PublisherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/publishers")
public class PublisherController {

    @Autowired
    PublisherMapper publisherMapper;

    @GetMapping("/get")
    public List<PublisherEntity> getAll(){

        return publisherMapper.getAll();
    }

}
