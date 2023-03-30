package alimama.example.housedemo.controller;

import alimama.example.housedemo.entity.HouseInfo;
import alimama.example.housedemo.service.HouseInfoService;
import alimama.example.housedemo.service.TransferService;
import alimama.example.housedemo.util.PythonExecute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/transfer")
public class TransferController {
    @Autowired
    HouseInfoService houseInfoService;
    @Autowired
    TransferService transferService;


    @RequestMapping("/getdata")
    @ResponseBody
    public String transform() {
        List<HouseInfo> houseInfoList = houseInfoService.findAll();
        for (int i = 0; i < houseInfoList.size(); i++) {
            HouseInfo houseInfo = houseInfoList.get(i);
            String layouts[] = houseInfo.getLayout().split(";");
            String tags[] = houseInfo.getTags().split(";");
            transferService.insertHouse(houseInfo.getId() + 1, houseInfo.getName(), houseInfo.getSquare(), houseInfo.getCity(),
                    houseInfo.getTown(), houseInfo.getDetail(), houseInfo.getSellingstatus(), houseInfo.getHousetype());
            transferService.insertPrice(houseInfo.getId() + 1, houseInfo.getPricetype(), houseInfo.getPrice());
            if (layouts != null) {
                for (int j = 0; j < layouts.length; j++) {
                    //定位layout
                    int lid;
                    if (layouts[j].equals("别墅")) {
                        lid = 12;
                    } else if (layouts[j].equals("商业")) {
                        lid = 11;
                    } else {
                        if (layouts[j].length() != 0) {
//                            System.out.println("最后一个"+layouts[j].charAt(0));
                            lid = layouts[j].charAt(0) - 48;
                        } else {
                            continue;
                        }
                    }
                    transferService.insertStructure(houseInfo.getId() + 1, lid);
//                    houseInfoService.
                }
            }
            if (tags != null) {
                for (int j = 0; j < tags.length; j++) {
                    transferService.insertTag(houseInfo.getId() + 1, tags[j]);
                }
            }

        }
        return "执行成功";
    }

    @RequestMapping("/request")
    @ResponseBody
    public String runPython() {
        PythonExecute.exec();
        return "执行成功";
    }
}
