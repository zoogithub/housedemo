package alimama.example.housedemo.mapper;

import alimama.example.housedemo.entity.HouseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RankMapper {
    public List<HouseInfo> selectTop100();

    public List<HouseInfo> selectCheap100();

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
