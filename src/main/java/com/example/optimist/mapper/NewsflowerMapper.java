package com.example.optimist.mapper;

import com.example.optimist.entity.Newsflower;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 65667
 */
@Mapper
public interface NewsflowerMapper {
    int deleteByPrimaryKey(Integer nno);

    int insert(Newsflower record);

    int insertSelective(Newsflower record);

    Newsflower selectByPrimaryKey(Integer nno);

    List<Newsflower> returnAll();

    int updateByPrimaryKeySelective(Newsflower record);

    int updateByPrimaryKey(Newsflower record);
}