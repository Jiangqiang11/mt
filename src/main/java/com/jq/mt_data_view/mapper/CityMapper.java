package com.jq.mt_data_view.mapper;

import com.jq.mt_data_view.entry.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityMapper {

    @Select("SELECT\n" +
            "province, sum(school_orders + company_order + home_order) `VALUES`\n" +
            "FROM order_distribute\n" +
            "GROUP BY province\n" +
            ";")
    public List<City> listCities();
}
