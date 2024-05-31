package calculation;

public class TemperatureCalculation {

    public static double calculateCelsiusToKelvin(double celsius){
        return celsius + 273.15;
    }

    public static double calculateCelsiusToFahrenheit(double celsius){
        return (celsius * 1.8) + 32;
    }

    public static double calculateKelvinToFahrenheit(double kelvin){
        return ((kelvin * 273.15) * 1.8) + 32;
    }

    public static double calculateKelvinToCelsius(double kelvin){
        return kelvin - 273.15;
    }

    public static double calculateFahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) / 1.8 ;
    }

    public static double calculateFahrenheitToKelvin(double fahrenheit){
        return ((fahrenheit - 32) / 1.8) +273.15;
    }
}
