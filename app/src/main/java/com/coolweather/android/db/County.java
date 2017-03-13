package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhide on 2017/3/13.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String wetherId;
    private int cityId;

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWetherId() {
        return wetherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWetherId(String wetherId) {
        this.wetherId = wetherId;
    }
}
