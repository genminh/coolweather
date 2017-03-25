package material.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by chang on 2017/3/23 0023.
 */

public class City extends DataSupport {
    private int id;
    private int cityCode;
    private String cityName;
    private int proviceId;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProviceId() {
        return proviceId;
    }

    public void setProviceId(int proviceId) {
        this.proviceId = proviceId;
    }



}
