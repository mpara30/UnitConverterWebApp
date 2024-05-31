package com.unitconverterwebapp;

import com.rest.LengthController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = LengthController.class)
public class UnitConverterWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitConverterWebAppApplication.class, args);
	}

}
