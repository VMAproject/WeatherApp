package com.weather.domain;


import lombok.Data;

@Data
public class Weather {

    private String city;
    private String description;
    private String temperature;
    private String wind;

}
