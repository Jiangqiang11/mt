package com.jq.mt_data_view.entry;


public class City {
    private String province;
    private Long values;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Long getValues() {
        return values;
    }

    public void setValues(Long values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "City{" +
                "province='" + province + '\'' +
                ", values=" + values +
                '}';
    }
}
