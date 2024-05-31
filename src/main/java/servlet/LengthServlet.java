package servlet;

import calculation.LengthCalculation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LengthServlet", urlPatterns = {"/calculatedLength"})
public class LengthServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/length.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String feet = request.getParameter("feet");
        String meters = request.getParameter("meters");
        String inches = request.getParameter("inches");
        String centimeters = request.getParameter("centimeters");
        String yards = request.getParameter("yards");
        String kilometers = request.getParameter("kilometers");
        String miles = request.getParameter("miles");

        if(meters.isEmpty() && inches.isEmpty() && centimeters.isEmpty() && yards.isEmpty() && kilometers.isEmpty() && miles.isEmpty()){
            double resultMeters = LengthCalculation.calculateFeetToMeters(Double.parseDouble(feet));
            double resultInches = LengthCalculation.calculateFeetToInches(Double.parseDouble(feet));
            double resultCentimeters = LengthCalculation.calculateFeetToCentimeters(Double.parseDouble(feet));
            double resultYards = LengthCalculation.calculateFeetToYards(Double.parseDouble(feet));
            double resultKilometers = LengthCalculation.calculateFeetToKilometers(Double.parseDouble(feet));
            double resultMiles = LengthCalculation.calculateFeetToMiles(Double.parseDouble(feet));

            request.setAttribute("feet", feet);
            request.setAttribute("meters", resultMeters);
            request.setAttribute("inches", resultInches);
            request.setAttribute("centimeters", resultCentimeters);
            request.setAttribute("yards", resultYards);
            request.setAttribute("kilometers", resultKilometers);
            request.setAttribute("miles", resultMiles);
        }

        if(feet.isEmpty() && inches.isEmpty() && centimeters.isEmpty() && yards.isEmpty() && kilometers.isEmpty() && miles.isEmpty()){
            double resultFeet = LengthCalculation.calculateMetersToFeet(Double.parseDouble(meters));
            double resultInches = LengthCalculation.calculateMetersToInches(Double.parseDouble(meters));
            double resultCentimeters = LengthCalculation.calculateMetersToCentimeters(Double.parseDouble(meters));
            double resultYards = LengthCalculation.calculateMetersToYards(Double.parseDouble(meters));
            double resultKilometers = LengthCalculation.calculateMetersToKilometers(Double.parseDouble(meters));
            double resultMiles = LengthCalculation.calculateMetersToMiles(Double.parseDouble(meters));

            request.setAttribute("feet", resultFeet);
            request.setAttribute("meters", meters);
            request.setAttribute("inches", resultInches);
            request.setAttribute("centimeters", resultCentimeters);
            request.setAttribute("yards", resultYards);
            request.setAttribute("kilometers", resultKilometers);
            request.setAttribute("miles", resultMiles);
        }

        if(feet.isEmpty() && meters.isEmpty() && centimeters.isEmpty() && yards.isEmpty() && kilometers.isEmpty() && miles.isEmpty()){
            double resultFeet = LengthCalculation.calculateInchesToFeet(Double.parseDouble(inches));
            double resultMeters = LengthCalculation.calculateInchesToMeters(Double.parseDouble(inches));
            double resultCentimeters = LengthCalculation.calculateInchesToCentimeters(Double.parseDouble(inches));
            double resultYards = LengthCalculation.calculateInchesToYards(Double.parseDouble(inches));
            double resultKilometers = LengthCalculation.calculateInchesToKilometers(Double.parseDouble(inches));
            double resultMiles = LengthCalculation.calculateInchesToMiles(Double.parseDouble(inches));

            request.setAttribute("feet", resultFeet);
            request.setAttribute("meters", resultMeters);
            request.setAttribute("inches", inches);
            request.setAttribute("centimeters", resultCentimeters);
            request.setAttribute("yards", resultYards);
            request.setAttribute("kilometers", resultKilometers);
            request.setAttribute("miles", resultMiles);
        }

        if(feet.isEmpty() && meters.isEmpty() && inches.isEmpty() && yards.isEmpty() && kilometers.isEmpty() && miles.isEmpty()){
            double resultFeet = LengthCalculation.calculateCentimetersToFeet(Double.parseDouble(centimeters));
            double resultMeters = LengthCalculation.calculateCentimetersToMeters(Double.parseDouble(centimeters));
            double resultInches = LengthCalculation.calculateCentimetersToInches(Double.parseDouble(centimeters));
            double resultYards = LengthCalculation.calculateCentimetersToYards(Double.parseDouble(centimeters));
            double resultKilometers = LengthCalculation.calculateCentimetersToKilometers(Double.parseDouble(centimeters));
            double resultMiles = LengthCalculation.calculateCentimetersToMiles(Double.parseDouble(centimeters));

            request.setAttribute("feet", resultFeet);
            request.setAttribute("meters", resultMeters);
            request.setAttribute("inches", resultInches);
            request.setAttribute("centimeters", centimeters);
            request.setAttribute("yards", resultYards);
            request.setAttribute("kilometers", resultKilometers);
            request.setAttribute("miles", resultMiles);
        }

        if(feet.isEmpty() && meters.isEmpty() && centimeters.isEmpty() && inches.isEmpty() && kilometers.isEmpty() && miles.isEmpty()){
            double resultFeet = LengthCalculation.calculateYardsToFeet(Double.parseDouble(yards));
            double resultMeters = LengthCalculation.calculateYardsToMeters(Double.parseDouble(yards));
            double resultInches = LengthCalculation.calculateYardsToInches(Double.parseDouble(yards));
            double resultCentimeters = LengthCalculation.calculateYardsToCentimeter(Double.parseDouble(yards));
            double resultKilometers = LengthCalculation.calculateYardsToKilometers(Double.parseDouble(yards));
            double resultMiles = LengthCalculation.calculateYardsToMiles(Double.parseDouble(yards));

            request.setAttribute("feet", resultFeet);
            request.setAttribute("meters", resultMeters);
            request.setAttribute("inches", resultInches);
            request.setAttribute("centimeters", resultCentimeters);
            request.setAttribute("yards", yards);
            request.setAttribute("kilometers", resultKilometers);
            request.setAttribute("miles", resultMiles);
        }

        if(feet.isEmpty() && meters.isEmpty() && centimeters.isEmpty() && inches.isEmpty() && yards.isEmpty() && miles.isEmpty()){
            double resultFeet = LengthCalculation.calculateKilometersToFeet(Double.parseDouble(kilometers));
            double resultMeters = LengthCalculation.calculateKilometersToMeters(Double.parseDouble(kilometers));
            double resultInches = LengthCalculation.calculateKilometersToInches(Double.parseDouble(kilometers));
            double resultCentimeters = LengthCalculation.calculateKilometersToCentimeters(Double.parseDouble(kilometers));
            double resultYards = LengthCalculation.calculateKilometersToYards(Double.parseDouble(kilometers));
            double resultMiles = LengthCalculation.calculateKilometersToMiles(Double.parseDouble(kilometers));

            request.setAttribute("feet", resultFeet);
            request.setAttribute("meters", resultMeters);
            request.setAttribute("inches", resultInches);
            request.setAttribute("centimeters", resultCentimeters);
            request.setAttribute("yards", resultYards);
            request.setAttribute("kilometers", kilometers);
            request.setAttribute("miles", resultMiles);
        }

        if(feet.isEmpty() && meters.isEmpty() && centimeters.isEmpty() && inches.isEmpty() && yards.isEmpty() && kilometers.isEmpty()){
            double resultFeet = LengthCalculation.calculateMilesToFeet(Double.parseDouble(miles));
            double resultMeters = LengthCalculation.calculateMilesToMeters(Double.parseDouble(miles));
            double resultInches = LengthCalculation.calculateMilesToInches(Double.parseDouble(miles));
            double resultCentimeters = LengthCalculation.calculateMilesToCentimeters(Double.parseDouble(miles));
            double resultYards = LengthCalculation.calculateMilesToYards(Double.parseDouble(miles));
            double resultKilometers = LengthCalculation.calculateMilesToKilometers(Double.parseDouble(miles));

            request.setAttribute("feet", resultFeet);
            request.setAttribute("meters", resultMeters);
            request.setAttribute("inches", resultInches);
            request.setAttribute("centimeters", resultCentimeters);
            request.setAttribute("yards", resultYards);
            request.setAttribute("kilometers", resultKilometers);
            request.setAttribute("miles", miles);
        }

        getServletContext().getRequestDispatcher("/length.jsp").forward(request, response);
    }
}
