package com.example.optimist.mapper;

import com.example.optimist.entity.Flower;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 65667
 */
@Mapper
public interface FlowerMapper {
    int deleteByPrimaryKey(Integer fno);

    int insert(Flower record);

    int insertSelective(Flower record);

    Flower selectByPrimaryKey(Integer fno);

    List<Flower> returnAll();

    int updateByPrimaryKeySelective(Flower record);

    int updateByPrimaryKey(Flower record);
}