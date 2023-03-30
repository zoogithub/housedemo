package alimama.example.housedemo.service.Impl;

import alimama.example.housedemo.entity.HouseInfo;
import alimama.example.housedemo.mapper.RankMapper;
import alimama.example.housedemo.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankServiceImpl implements RankService {
    @Autowired
    RankMapper rankMapper;

    @Override
    public List<HouseInfo> selectTop() {
        return rankMapper.selectTop100();
    }

    @Override
    public List<HouseInfo> selectCheap() {
        return rankMapper.selectCheap100();
    }

    @Override
    public List<HouseInfo> selectTianheTop10() {
        return rankMapper.selectTianheTop10();
    }

    @Override
    public List<HouseInfo> selectBaiyunTop10() {
        return rankMapper.selectBaiyunTop10();
    }

    @Override
    public List<HouseInfo> selectHuaduTop10() {
        return rankMapper.selectHuaduTop10();
    }

    @Override
    public List<HouseInfo> selectYuexiuTop10() {
        return rankMapper.selectYuexiuTop10();
    }

    @Override
    public List<HouseInfo> selectLiwanTop10() {
        return rankMapper.selectLiwanTop10();
    }

    @Override
    public List<HouseInfo> selectHaizhuTop10() {
        return rankMapper.selectHaizhuTop10();
    }

    @Override
    public List<HouseInfo> selectTianheCheap10() {
        return rankMapper.selectTianheCheap10();
    }

    @Override
    public List<HouseInfo> selectBaiyunCheap10() {
        return rankMapper.selectBaiyunCheap10();
    }

    @Override
    public List<HouseInfo> selectHuaduCheap10() {
        return rankMapper.selectHuaduCheap10();
    }

    @Override
    public List<HouseInfo> selectYuexiuCheap10() {
        return rankMapper.selectYuexiuCheap10();
    }

    @Override
    public List<HouseInfo> selectLiwanCheap10() {
        return rankMapper.selectLiwanCheap10();
    }

    @Override
    public List<HouseInfo> selectHaizhuCheap10() {
        return rankMapper.selectHaizhuCheap10();
    }
}
