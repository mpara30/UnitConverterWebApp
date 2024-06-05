package com.rest;

import com.calculation.TemperatureCalculation;
import com.model.Error;
import com.model.TemperatureModel;
import com.util.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    @PostMapping("/calculateCelsius")
    public ResponseEntity<TemperatureModel> calculateCelsius(@RequestBody TemperatureModel temperatureModel) {
        if (temperatureModel.getCelsius() == null) {
            Error error = new Error();
            error.setErrorCode(Constants.BAD_REQUEST_ERROR_CODE);
            error.setErrorMessage("BAD_REQUEST: Need to provide celsius value");

            temperatureModel.setError(error);
            return new ResponseEntity<>(temperatureModel, HttpStatus.BAD_REQUEST);
        }

        Double celsius = temperatureModel.getCelsius();
        temperatureModel.setKelvin(TemperatureCalculation.calculateCelsiusToKelvin(celsius));
        temperatureModel.setFahrenheit(TemperatureCalculation.calculateCelsiusToFahrenheit(celsius));

        return new ResponseEntity<>(temperatureModel, HttpStatus.OK);
    }

    @PostMapping("/calculateKelvin")
    public ResponseEntity<TemperatureModel> calculateKelvin(@RequestBody TemperatureModel temperatureModel) {
        if (temperatureModel.getKelvin() == null) {
            Error error = new Error();
            error.setErrorCode(Constants.BAD_REQUEST_ERROR_CODE);
            error.setErrorMessage("BAD_REQUEST: Need to provide kelvin value");

            temperatureModel.setError(error);
            return new ResponseEntity<>(temperatureModel, HttpStatus.BAD_REQUEST);
        }

        Double kelvin = temperatureModel.getKelvin();
        temperatureModel.setCelsius(TemperatureCalculation.calculateKelvinToCelsius(kelvin));
        temperatureModel.setFahrenheit(TemperatureCalculation.calculateKelvinToFahrenheit(kelvin));

        return new ResponseEntity<>(temperatureModel, HttpStatus.OK);
    }

    @PostMapping("/calculateFahrenheit")
    public ResponseEntity<TemperatureModel> calculateFahrenheit(@RequestBody TemperatureModel temperatureModel) {
        if (temperatureModel.getFahrenheit() == null) {
            Error error = new Error();
            error.setErrorCode(Constants.BAD_REQUEST_ERROR_CODE);
            error.setErrorMessage("BAD_REQUEST: Need to provide fahrenheit value");

            temperatureModel.setError(error);
            return new ResponseEntity<>(temperatureModel, HttpStatus.BAD_REQUEST);
        }

        Double fahrenheit = temperatureModel.getFahrenheit();
        temperatureModel.setKelvin(TemperatureCalculation.calculateFahrenheitToKelvin(fahrenheit));
        temperatureModel.setCelsius(TemperatureCalculation.calculateFahrenheitToCelsius(fahrenheit));

        return new ResponseEntity<>(temperatureModel, HttpStatus.OK);
    }
}
