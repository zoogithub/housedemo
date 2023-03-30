package alimama.example.housedemo.controller;

import com.alibaba.fastjson.JSON;
import alimama.example.housedemo.service.FigureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
@RequestMapping("/figure")
public class FigureController {
    @Autowired
    FigureService figureService;

    @RequestMapping(value = "/hts")
    @ResponseBody
    public String houseTypeStatistic() {
        return JSON.toJSONString(figureService.selectByHouseType());//springboot的json有bug，只能这样处理
    }

    @RequestMapping("/area")
    @ResponseBody
    public String address1Statistic() {

        return JSON.toJSONString(figureService.selectByCity());
    }

    @RequestMapping("status")
    @ResponseBody
    public String statusStatistic() {
        return JSON.toJSONString(figureService.selectBySellingStatus());
    }

    @RequestMapping("countarea")
    @ResponseBody
    public String countArea() {
        return JSON.toJSONString(figureService.countArea());
    }

    @RequestMapping("counthts")
    @ResponseBody
    public String countHouseTypeStatistic() {
        return JSON.toJSONString(figureService.countHouseType());
    }

    @RequestMapping("countstatus")
    @ResponseBody
    public String countHouseStatus() {
        return JSON.toJSONString(figureService.countStatus());
    }

    @RequestMapping("countlayout")
    @ResponseBody
    public String countLayout() {
        return JSON.toJSONString(figureService.countHuxing());
    }

    @RequestMapping("layout")
    @ResponseBody
    public String layout() {
        return JSON.toJSONString(figureService.selectByLayout());
    }

    @RequestMapping("counttags")
    @ResponseBody
    public String countTags() {
        return JSON.toJSONString(figureService.countTags());
    }
}
