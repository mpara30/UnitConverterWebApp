package com.rest;

import com.calculation.LengthCalculation;
import com.model.LengthModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LengthController {

    @GetMapping("/")
    public String welcomePage() {
        return "Hello and welcome!";
    }

    @PostMapping("/calculateMeters")
    public ResponseEntity<LengthModel> calculateMeters(@RequestBody LengthModel lengthModel) {

        Double meters = lengthModel.getMeters();
        lengthModel.setFeet(LengthCalculation.calculateMetersToFeet(meters));
        lengthModel.setInches(LengthCalculation.calculateMetersToInches(meters));
        lengthModel.setCentimeters(LengthCalculation.calculateMetersToCentimeters(meters));
        lengthModel.setYards(LengthCalculation.calculateMetersToYards(meters));
        lengthModel.setKilometers(LengthCalculation.calculateMetersToKilometers(meters));
        lengthModel.setMiles(LengthCalculation.calculateMetersToMiles(meters));

        return new ResponseEntity<>(lengthModel, HttpStatus.OK);
    }

}
