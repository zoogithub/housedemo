package alimama.example.housedemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TransferMapper {
    public void insertHouse(int id, String name, String square,
                            String city, String town, String detail, String sellingstatus,
                            String housetype);

    public void insertPrice(int id, String pricetype, Float value);

    public void insertStructure(int hid, int lid);

    public void insertTag(int hid, String tag);
}
