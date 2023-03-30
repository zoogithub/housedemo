package alimama.example.housedemo.mapper;

import alimama.example.housedemo.entity.HouseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HouseInfoMapper {
    public List<HouseInfo> findAll();

}
