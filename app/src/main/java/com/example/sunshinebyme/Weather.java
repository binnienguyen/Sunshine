package com.example.sunshinebyme;

public class Weather {
    private int res;
    private String date;
    private String forecast;
    private int highestTemp;
    private int lowestTemp;

    public Weather(int res, String date, String forecast, int highestTemp, int lowestTemp) {
        this.res = res;
        this.date = date;
        this.forecast = forecast;
        this.highestTemp = highestTemp;
        this.lowestTemp = lowestTemp;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public int getHighestTemp() {
        return highestTemp;
    }

    public void setHighestTemp(int highestTemp) {
        this.highestTemp = highestTemp;
    }

    public int getLowestTemp() {
        return lowestTemp;
    }

    public void setLowestTemp(int lowestTemp) {
        this.lowestTemp = lowestTemp;
    }
}
