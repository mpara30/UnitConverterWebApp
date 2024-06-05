package com.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TemperatureModel {

    private Double celsius;
    private Double kelvin;
    private Double fahrenheit;
    private Error error;
}
