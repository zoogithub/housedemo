package alimama.example.housedemo.service.Impl;

import alimama.example.housedemo.mapper.TransferMapper;
import alimama.example.housedemo.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferServiceImpl implements TransferService {
    @Autowired
    TransferMapper transferMapper;

    @Override
    public void insertHouse(int id, String name, String square, String city, String town, String detail, String sellingstatus, String housetype) {
        transferMapper.insertHouse(id, name, square, city, town, detail, sellingstatus, housetype);

    }

    @Override
    public void insertPrice(int id, String pricetype, Float value) {
        transferMapper.insertPrice(id, pricetype, value);
    }

    @Override
    public void insertStructure(int hid, int lid) {
        transferMapper.insertStructure(hid, lid);
    }

    @Override
    public void insertTag(int hid, String tag) {
        transferMapper.insertTag(hid, tag);
    }
}
