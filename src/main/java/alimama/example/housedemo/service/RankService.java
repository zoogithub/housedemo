package alimama.example.housedemo.service;

import alimama.example.housedemo.entity.HouseInfo;

import java.util.List;

public interface RankService {
    public List<HouseInfo> selectTop();

    public List<HouseInfo> selectCheap();

    public List<HouseInfo> selectTianheTop10();

    public List<HouseInfo> selectBaiyunTop10();

    public List<HouseInfo> selectHuaduTop10();

    public List<HouseInfo> selectYuexiuTop10();

    public List<HouseInfo> selectLiwanTop10();

    public List<HouseInfo> selectHaizhuTop10();

    public List<HouseInfo> selectTianheCheap10();

    public List<HouseInfo> selectBaiyunCheap10();

    public List<HouseInfo> selectHuaduCheap10();

    public List<HouseInfo> selectYuexiuCheap10();

    public List<HouseInfo> selectLiwanCheap10();

    public List<HouseInfo> selectHaizhuCheap10();
}
