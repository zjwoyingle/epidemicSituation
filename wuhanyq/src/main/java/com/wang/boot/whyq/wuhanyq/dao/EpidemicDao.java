package com.wang.boot.whyq.wuhanyq.dao;

import com.wang.boot.whyq.wuhanyq.dto.EpidemicDto;
import com.wang.boot.whyq.wuhanyq.mapper.EpidemicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/*
 *@author: Wang He
 *@time: 2020/01/11 15:20
 *@description:
 */

//@Mapper
//@Component
@Repository
public class EpidemicDao {
    @Autowired
    private EpidemicMapper mapper;
    public List<EpidemicDto> selectByObject(EpidemicDto dto){
        return mapper.selectByObject(dto);
    }
    public int insertByObject(EpidemicDto dto){
        return mapper.insertByObject(dto);
    }
    public int deleteByObject(EpidemicDto dto){
        return mapper.deleteByObject(dto);
    }



}
