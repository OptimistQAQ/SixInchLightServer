package com.example.optimist.mapper;

import com.example.optimist.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 65667
 */
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer uno);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uno);
    User selectByName(String name);

    List<User> returnAll();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}