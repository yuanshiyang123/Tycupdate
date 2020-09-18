package com.tyc.update.dao;

import com.tyc.update.entity.CompanyUpdate;
import com.tyc.update.entity.CompanyUpdateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  @Author: yuanshiyang
 *  @CompanyName: 中汽智投
 *  @Description:
 *  @Date: 2020/9/16 14:38
 */
public interface CompanyUpdateDao {
    long countByExample(CompanyUpdateExample example);

    int deleteByExample(CompanyUpdateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyUpdate record);

    int insertSelective(CompanyUpdate record);

    List<CompanyUpdate> selectByExample(CompanyUpdateExample example);

    CompanyUpdate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompanyUpdate record, @Param("example") CompanyUpdateExample example);

    int updateByExample(@Param("record") CompanyUpdate record, @Param("example") CompanyUpdateExample example);

    int updateByPrimaryKeySelective(CompanyUpdate record);

    int updateByPrimaryKey(CompanyUpdate record);

    CompanyUpdate selectByNameAndBatch(@Param("name") String name,@Param("batch") String batch);
}