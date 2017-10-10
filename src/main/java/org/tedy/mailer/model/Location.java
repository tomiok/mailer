package org.tedy.mailer.model;

/**
 * Created by tedy on 17/1/17.
 */
public class Location {

    private Double latitude;
    private Double longtitude;
    private Double gmtoff;
    private Double dstoff;
    private String country_code;
    private String timezone;

    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongtitude() {
        return longtitude;
    }
    public void setLongtitude(Double longtitude) {
        this.longtitude = longtitude;
    }

    public Double getGmtoff() {
        return gmtoff;
    }
    public void setGmtoff(Double gmtoff) {
        this.gmtoff = gmtoff;
    }

    public Double getDstoff() {
        return dstoff;
    }
    public void setDstoff(Double dstoff) {
        this.dstoff = dstoff;
    }

    public String getCountry_code() {
        return country_code;
    }
    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getTimezone() {
        return timezone;
    }
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}