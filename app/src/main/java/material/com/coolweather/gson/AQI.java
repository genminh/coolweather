package material.com.coolweather.gson;

/**
 * Created by chang on 2017/3/26 0026.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
