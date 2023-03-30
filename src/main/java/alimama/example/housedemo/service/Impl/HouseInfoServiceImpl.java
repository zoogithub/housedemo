package alimama.example.housedemo.service.Impl;

import alimama.example.housedemo.entity.HouseInfo;
import alimama.example.housedemo.mapper.HouseInfoMapper;
import alimama.example.housedemo.service.HouseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseInfoServiceImpl implements HouseInfoService {
    @Autowired
    HouseInfoMapper houseInfoMapper;

    @Override
    public List<HouseInfo> findAll() {
        return houseInfoMapper.findAll();
    }
}
