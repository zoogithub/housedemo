package alimama.example.housedemo.service.Impl;

import alimama.example.housedemo.mapper.FigureMapper;
import alimama.example.housedemo.service.FigureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FigureServiceImpl implements FigureService {
    @Autowired
    FigureMapper figureMapper;

    @Override
    public List<Map<String, Float>> selectByHouseType() {
        return figureMapper.selectByHouseType();
    }

    @Override
    public List<Map<String, Float>> selectByCity() {
        return figureMapper.selectByCity();
    }

    @Override
    public List<Map<String, Float>> selectBySellingStatus() {
        return figureMapper.selectBySellingStatus();
    }

    @Override
    public List<Float> selectByLayout() {
        return figureMapper.selectByLayout();
    }

    @Override
    public List<Map<String, Float>> countHouseType() {
        return figureMapper.countHouseType();
    }

    @Override
    public List<Map<String, Float>> countArea() {
        return figureMapper.countArea();
    }

    @Override
    public List<Map<String, Float>> countStatus() {
        return figureMapper.countStatus();
    }

    @Override
    public List<Map<String, Float>> countHuxing() {
        return figureMapper.countHuxing();
    }

    @Override
    public List<Map<String, Float>> countTags() {
        return figureMapper.countTags();
    }
}
