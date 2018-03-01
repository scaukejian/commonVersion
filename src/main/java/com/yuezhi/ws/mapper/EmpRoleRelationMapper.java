package com.yuezhi.ws.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yuezhi.ws.domain.EmpRoleRelationExample;
import com.yuezhi.ws.domain.EmpRoleRelationKey;

public interface EmpRoleRelationMapper {
    int deleteByExample(EmpRoleRelationExample example);

    int deleteByPrimaryKey(EmpRoleRelationKey key);

    int insert(EmpRoleRelationKey record);

    int insertSelective(EmpRoleRelationKey record);

    List<EmpRoleRelationKey> selectByExample(EmpRoleRelationExample example);

    int updateByExampleSelective(@Param("record") EmpRoleRelationKey record, @Param("example") EmpRoleRelationExample example);

    int updateByExample(@Param("record") EmpRoleRelationKey record, @Param("example") EmpRoleRelationExample example);
}