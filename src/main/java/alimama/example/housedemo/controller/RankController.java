package alimama.example.housedemo.controller;

import alimama.example.housedemo.entity.HouseInfo;
import alimama.example.housedemo.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("rank")
public class RankController {
    @Autowired
    RankService rankService;

    @RequestMapping("/top")
    @ResponseBody//以json格式传输结果给客户端
    public List<HouseInfo> getTop() {
        return rankService.selectTop();
    }

    @RequestMapping("/cheap")
    @ResponseBody
    public List<HouseInfo> getCheap() {
        return rankService.selectCheap();
    }

    @RequestMapping("/tianhetop")
    @ResponseBody
    public List<HouseInfo> getTianheTop() {
        return rankService.selectTianheTop10();
    }

    @RequestMapping("/tianhecheap")
    @ResponseBody
    public List<HouseInfo> getTianheCheap() {
        return rankService.selectTianheCheap10();
    }

    @RequestMapping("/yuexiutop")
    @ResponseBody
    public List<HouseInfo> getYuexiuTop() {
        return rankService.selectYuexiuTop10();
    }

    @RequestMapping("/yuexiucheap")
    @ResponseBody
    public List<HouseInfo> getYuexiuCheap() {
        return rankService.selectYuexiuCheap10();
    }

    @RequestMapping("/liwantop")
    @ResponseBody
    public List<HouseInfo> getLiwanTop() {
        return rankService.selectLiwanTop10();
    }

    @RequestMapping("/liwancheap")
    @ResponseBody
    public List<HouseInfo> getLiwanCheap() {
        return rankService.selectLiwanCheap10();
    }

    @RequestMapping("/haizhutop")
    @ResponseBody
    public List<HouseInfo> getHaizhuTop() {
        return rankService.selectHaizhuTop10();
    }

    @RequestMapping("/haizhucheap")
    @ResponseBody
    public List<HouseInfo> getHaizhuCheap() {
        return rankService.selectHaizhuCheap10();
    }

    @RequestMapping("/baiyuntop")
    @ResponseBody
    public List<HouseInfo> getBaiyunTop() {
        return rankService.selectBaiyunTop10();
    }

    @RequestMapping("/baiyuncheap")
    @ResponseBody
    public List<HouseInfo> getBaiyunCheap() {
        return rankService.selectBaiyunCheap10();
    }

    @RequestMapping("/huadutop")
    @ResponseBody
    public List<HouseInfo> getHuaduTop() {
        return rankService.selectHuaduTop10();
    }

    @RequestMapping("/huaducheap")
    @ResponseBody
    public List<HouseInfo> getHuaduCheap() {
        return rankService.selectHuaduCheap10();
    }
}
