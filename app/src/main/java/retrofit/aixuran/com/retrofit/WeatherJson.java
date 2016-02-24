package retrofit.aixuran.com.retrofit;

/**红心A*/
public class WeatherJson {

    /**
     * city : 北京
     * cityid : 101010100
     * temp : 10
     * WD : 东南风
     * WS : 2级
     * SD : 26%
     * WSE : 2
     * time : 10:25
     * isRadar : 1
     * Radar : JC_RADAR_AZ9010_JB
     * njd : 暂无实况
     * qy : 1012
     */

    private WeatherinfoEntity weatherinfo;

    public void setWeatherinfo(WeatherinfoEntity weatherinfo) {
        this.weatherinfo = weatherinfo;
    }

    public WeatherinfoEntity getWeatherinfo() {
        return weatherinfo;
    }

    public static class WeatherinfoEntity {
        private String city;
        private String cityid;
        private String temp;
        private String WD;
        private String WS;
        private String SD;
        private String WSE;
        private String time;
        private String isRadar;
        private String Radar;
        private String njd;
        private String qy;

        public void setCity(String city) {
            this.city = city;
        }

        public void setCityid(String cityid) {
            this.cityid = cityid;
        }

        public void setTemp(String temp) {
            this.temp = temp;
        }

        public void setWD(String WD) {
            this.WD = WD;
        }

        public void setWS(String WS) {
            this.WS = WS;
        }

        public void setSD(String SD) {
            this.SD = SD;
        }

        public void setWSE(String WSE) {
            this.WSE = WSE;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public void setIsRadar(String isRadar) {
            this.isRadar = isRadar;
        }

        public void setRadar(String Radar) {
            this.Radar = Radar;
        }

        public void setNjd(String njd) {
            this.njd = njd;
        }

        public void setQy(String qy) {
            this.qy = qy;
        }

        public String getCity() {
            return city;
        }

        public String getCityid() {
            return cityid;
        }

        public String getTemp() {
            return temp;
        }

        public String getWD() {
            return WD;
        }

        public String getWS() {
            return WS;
        }

        public String getSD() {
            return SD;
        }

        public String getWSE() {
            return WSE;
        }

        public String getTime() {
            return time;
        }

        public String getIsRadar() {
            return isRadar;
        }

        public String getRadar() {
            return Radar;
        }

        public String getNjd() {
            return njd;
        }

        public String getQy() {
            return qy;
        }
    }
}
