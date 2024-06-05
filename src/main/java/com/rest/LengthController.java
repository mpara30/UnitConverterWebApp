package com.rest;

import com.calculation.LengthCalculation;
import com.model.LengthModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LengthController {

    @PostMapping("/calculateMeters")
    public ResponseEntity<LengthModel> calculateMeters(@RequestBody LengthModel lengthModel) {
        if (lengthModel.getMeters() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Double meters = lengthModel.getMeters();
        lengthModel.setFeet(LengthCalculation.calculateMetersToFeet(meters));
        lengthModel.setInches(LengthCalculation.calculateMetersToInches(meters));
        lengthModel.setCentimeters(LengthCalculation.calculateMetersToCentimeters(meters));
        lengthModel.setYards(LengthCalculation.calculateMetersToYards(meters));
        lengthModel.setKilometers(LengthCalculation.calculateMetersToKilometers(meters));
        lengthModel.setMiles(LengthCalculation.calculateMetersToMiles(meters));

        return new ResponseEntity<>(lengthModel, HttpStatus.OK);
    }

    @PostMapping("/calculateFeet")
    public ResponseEntity<LengthModel> calculateFeet(@RequestBody LengthModel lengthModel) {
        if (lengthModel.getFeet() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Double feet = lengthModel.getFeet();
        lengthModel.setMeters(LengthCalculation.calculateFeetToMeters(feet));
        lengthModel.setInches(LengthCalculation.calculateFeetToInches(feet));
        lengthModel.setCentimeters(LengthCalculation.calculateFeetToCentimeters(feet));
        lengthModel.setYards(LengthCalculation.calculateFeetToYards(feet));
        lengthModel.setKilometers(LengthCalculation.calculateFeetToKilometers(feet));
        lengthModel.setMiles(LengthCalculation.calculateFeetToMiles(feet));

        return new ResponseEntity<>(lengthModel, HttpStatus.OK);
    }

    @PostMapping("/calculateInches")
    public ResponseEntity<LengthModel> calculateInches(@RequestBody LengthModel lengthModel) {
        if (lengthModel.getInches() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Double inches = lengthModel.getInches();
        lengthModel.setMeters(LengthCalculation.calculateInchesToMeters(inches));
        lengthModel.setFeet(LengthCalculation.calculateInchesToFeet(inches));
        lengthModel.setCentimeters(LengthCalculation.calculateInchesToCentimeters(inches));
        lengthModel.setYards(LengthCalculation.calculateInchesToYards(inches));
        lengthModel.setKilometers(LengthCalculation.calculateInchesToKilometers(inches));
        lengthModel.setMiles(LengthCalculation.calculateInchesToMiles(inches));

        return new ResponseEntity<>(lengthModel, HttpStatus.OK);
    }

    @PostMapping("/calculateCentimeters")
    public ResponseEntity<LengthModel> calculateCentimeters(@RequestBody LengthModel lengthModel) {
        if (lengthModel.getCentimeters() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Double centimeters = lengthModel.getCentimeters();
        lengthModel.setMeters(LengthCalculation.calculateCentimetersToMeters(centimeters));
        lengthModel.setInches(LengthCalculation.calculateCentimetersToInches(centimeters));
        lengthModel.setFeet(LengthCalculation.calculateCentimetersToFeet(centimeters));
        lengthModel.setYards(LengthCalculation.calculateCentimetersToYards(centimeters));
        lengthModel.setKilometers(LengthCalculation.calculateCentimetersToKilometers(centimeters));
        lengthModel.setMiles(LengthCalculation.calculateCentimetersToMiles(centimeters));

        return new ResponseEntity<>(lengthModel, HttpStatus.OK);
    }

    @PostMapping("/calculateYards")
    public ResponseEntity<LengthModel> calculateYards(@RequestBody LengthModel lengthModel) {
        if (lengthModel.getYards() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Double yards = lengthModel.getYards();
        lengthModel.setMeters(LengthCalculation.calculateYardsToMeters(yards));
        lengthModel.setInches(LengthCalculation.calculateYardsToInches(yards));
        lengthModel.setCentimeters(LengthCalculation.calculateYardsToCentimeter(yards));
        lengthModel.setFeet(LengthCalculation.calculateYardsToFeet(yards));
        lengthModel.setKilometers(LengthCalculation.calculateYardsToKilometers(yards));
        lengthModel.setMiles(LengthCalculation.calculateYardsToMiles(yards));

        return new ResponseEntity<>(lengthModel, HttpStatus.OK);
    }

    @PostMapping("/calculateKilometers")
    public ResponseEntity<LengthModel> calculateKilometers(@RequestBody LengthModel lengthModel) {
        if (lengthModel.getKilometers() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Double kilometers = lengthModel.getKilometers();
        lengthModel.setMeters(LengthCalculation.calculateKilometersToMeters(kilometers));
        lengthModel.setInches(LengthCalculation.calculateKilometersToInches(kilometers));
        lengthModel.setCentimeters(LengthCalculation.calculateKilometersToCentimeters(kilometers));
        lengthModel.setYards(LengthCalculation.calculateKilometersToYards(kilometers));
        lengthModel.setFeet(LengthCalculation.calculateKilometersToFeet(kilometers));
        lengthModel.setMiles(LengthCalculation.calculateKilometersToMiles(kilometers));

        return new ResponseEntity<>(lengthModel, HttpStatus.OK);
    }

    @PostMapping("/calculateMiles")
    public ResponseEntity<LengthModel> calculateMiles(@RequestBody LengthModel lengthModel) {
        if (lengthModel.getMiles() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Double miles = lengthModel.getMiles();
        lengthModel.setMeters(LengthCalculation.calculateMilesToMeters(miles));
        lengthModel.setInches(LengthCalculation.calculateMilesToInches(miles));
        lengthModel.setCentimeters(LengthCalculation.calculateMilesToCentimeters(miles));
        lengthModel.setYards(LengthCalculation.calculateMilesToYards(miles));
        lengthModel.setKilometers(LengthCalculation.calculateMilesToKilometers(miles));
        lengthModel.setFeet(LengthCalculation.calculateMilesToFeet(miles));

        return new ResponseEntity<>(lengthModel, HttpStatus.OK);
    }

}
