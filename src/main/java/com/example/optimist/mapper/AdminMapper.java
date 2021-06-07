package com.example.optimist.mapper;

import com.example.optimist.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 65667
 */
@Mapper
public interface AdminMapper {
    int deleteByPrimaryKey(Integer ano);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer ano);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}