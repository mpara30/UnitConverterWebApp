package servlet;

import calculation.LengthCalculation;
import calculation.TemperatureCalculation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TemperatureServlet", urlPatterns = {"/calculatedTemperatures"})
public class TemperatureServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/temperature.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String celsius = request.getParameter("celsius");
        String kelvin = request.getParameter("kelvin");
        String fahrenheit = request.getParameter("fahrenheit");

        if(celsius.isEmpty() && fahrenheit.isEmpty()){
            double resultCelsius = TemperatureCalculation.calculateKelvinToCelsius(Double.parseDouble(kelvin));
            double resultFahrenheit = TemperatureCalculation.calculateKelvinToFahrenheit(Double.parseDouble(kelvin));
            request.setAttribute("celsius", resultCelsius);
            request.setAttribute("fahrenheit", resultFahrenheit);
            request.setAttribute("kelvin", kelvin);
        }
        if (kelvin.isEmpty() && fahrenheit.isEmpty()){
            double resultKelvin = TemperatureCalculation.calculateCelsiusToKelvin(Double.parseDouble(celsius));
            double resultFahrenheit = TemperatureCalculation.calculateCelsiusToFahrenheit(Double.parseDouble(celsius));
            request.setAttribute("kelvin", resultKelvin);
            request.setAttribute("fahrenheit", resultFahrenheit);
            request.setAttribute("celsius", celsius);
        }
        if (celsius.isEmpty() && kelvin.isEmpty()){
            double resultCelsius = TemperatureCalculation.calculateFahrenheitToCelsius(Double.parseDouble(fahrenheit));
            double resultKelvin = TemperatureCalculation.calculateFahrenheitToKelvin(Double.parseDouble(fahrenheit));
            request.setAttribute("celsius", resultCelsius);
            request.setAttribute("kelvin", resultKelvin);
            request.setAttribute("fahrenheit", fahrenheit);
        }

        getServletContext().getRequestDispatcher("/temperature.jsp").forward(request, response);
    }
}
