package com.sayone.mybatis.springbootmybatis.api;

import com.sayone.mybatis.springbootmybatis.model.PublisherEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PublisherMapper {

    List<PublisherEntity> getAll();
}
