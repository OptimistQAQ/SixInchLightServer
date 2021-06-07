package com.example.optimist.mapper;

import com.example.optimist.entity.Attention;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 65667
 */
@Mapper
public interface AttentionMapper {
    int deleteByPrimaryKey(Integer ano);

    int insert(Attention record);

    int insertSelective(Attention record);

    Attention selectByPrimaryKey(Integer ano);

    int updateByPrimaryKeySelective(Attention record);

    int updateByPrimaryKey(Attention record);
}