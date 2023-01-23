package com.pandurang.patterns.adapter;

public class WeatherAdapter {
    public int findTemperature(int zipcode) {
        String city = null;
        if(zipcode == 19406) {
            city = "King of Prussia";
        }
        WeatherFinder finder = new WeatherFinderImpl();
        int temp = finder.find(city);
        return temp;
    }
}
