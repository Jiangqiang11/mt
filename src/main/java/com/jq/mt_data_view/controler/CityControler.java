package com.jq.mt_data_view.controler;

import com.jq.mt_data_view.entry.City;
import com.jq.mt_data_view.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityControler {

    @Autowired
    CityMapper cityMapper;

    @RequestMapping("/listCity")
    public List<City> getCities(){
        List<City> list = cityMapper.listCities();
        for (int i = 0; i < list.size(); i++) {
            String province = list.get(i).getProvince().replace('省',' ');
            list.get(i).setProvince(province.trim());
            System.out.println(list.get(i));
        }
        return list;
    }
}
