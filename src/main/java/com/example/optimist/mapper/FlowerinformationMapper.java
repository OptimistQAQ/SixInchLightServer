package com.example.optimist.mapper;

import com.example.optimist.entity.Flowerinformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 65667
 */
@Mapper
public interface FlowerinformationMapper {
    int deleteByPrimaryKey(Integer ino);

    int insert(Flowerinformation record);

    int insertSelective(Flowerinformation record);

    Flowerinformation selectByPrimaryKey(Integer ino);

    List<Flowerinformation> returnAll();

    int updateByPrimaryKeySelective(Flowerinformation record);

    int updateByPrimaryKey(Flowerinformation record);
}