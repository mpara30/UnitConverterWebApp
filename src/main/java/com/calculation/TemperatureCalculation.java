package com.calculation;

public class TemperatureCalculation {

    public static Double calculateCelsiusToKelvin(Double celsius){
        return celsius + 273.15;
    }

    public static Double calculateCelsiusToFahrenheit(Double celsius){
        return (celsius * 1.8) + 32;
    }

    public static Double calculateKelvinToFahrenheit(Double kelvin){
        return ((kelvin * 273.15) * 1.8) + 32;
    }

    public static Double calculateKelvinToCelsius(Double kelvin){
        return kelvin - 273.15;
    }

    public static Double calculateFahrenheitToCelsius(Double fahrenheit){
        return (fahrenheit - 32) / 1.8 ;
    }

    public static Double calculateFahrenheitToKelvin(Double fahrenheit){
        return ((fahrenheit - 32) / 1.8) +273.15;
    }
}
