package alimama.example.housedemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface FigureMapper {
    public List<Map<String, Float>> selectByHouseType();

    public List<Map<String, Float>> selectByCity();

    public List<Map<String, Float>> selectBySellingStatus();

    public List<Float> selectByLayout();

    public List<Map<String, Float>> countHouseType();

    public List<Map<String, Float>> countArea();

    public List<Map<String, Float>> countStatus();

    public List<Map<String, Float>> countHuxing();

    public List<Map<String, Float>> countTags();
}
