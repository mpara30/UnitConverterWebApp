package servlet;

import calculation.SpeedCalculation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SpeedServlet", urlPatterns = {"/calculatedSpeed"})
public class SpeedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/speed.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mph = request.getParameter("mph");
        String kph = request.getParameter("kph");
        String knots = request.getParameter("knots");
        String mach = request.getParameter("mach");

        if(kph.isEmpty() && knots.isEmpty() && mach.isEmpty()){
            double resultKph = SpeedCalculation.calculateMphToKph(Double.parseDouble(mph));
            double resultKnots = SpeedCalculation.calculateMphToKnots(Double.parseDouble(mph));
            double resultMach = SpeedCalculation.calculateMphToMach(Double.parseDouble(mph));

            request.setAttribute("mph", mph);
            request.setAttribute("kph", resultKph);
            request.setAttribute("knots", resultKnots);
            request.setAttribute("mach", resultMach);
        }

        if(mph.isEmpty() && knots.isEmpty() && mach.isEmpty()){
            double resultMph = SpeedCalculation.calculateKphToMph(Double.parseDouble(kph));
            double resultKnots = SpeedCalculation.calculateKphToKnots(Double.parseDouble(kph));
            double resultMach = SpeedCalculation.calculateKphToMach(Double.parseDouble(kph));

            request.setAttribute("mph", resultMph);
            request.setAttribute("kph", kph);
            request.setAttribute("knots", resultKnots);
            request.setAttribute("mach", resultMach);
        }

        if(mph.isEmpty() && kph.isEmpty() && mach.isEmpty()){
            double resultMph = SpeedCalculation.calculateKnotsToMph(Double.parseDouble(knots));
            double resultKph = SpeedCalculation.calculateKnotsToKph(Double.parseDouble(knots));
            double resultMach = SpeedCalculation.calculateKnotsToMach(Double.parseDouble(knots));

            request.setAttribute("mph", resultMph);
            request.setAttribute("kph", resultKph);
            request.setAttribute("knots", knots);
            request.setAttribute("mach", resultMach);
        }

        if(mph.isEmpty() && kph.isEmpty() && knots.isEmpty()){
            double resultMph = SpeedCalculation.calculateMachToMph(Double.parseDouble(mach));
            double resultKph = SpeedCalculation.calculateMachToKph(Double.parseDouble(mach));
            double resultKnots = SpeedCalculation.calculateMachToKnots(Double.parseDouble(mach));

            request.setAttribute("mph", resultMph);
            request.setAttribute("kph", resultKph);
            request.setAttribute("knots", resultKnots);
            request.setAttribute("mach", mach);
        }

        getServletContext().getRequestDispatcher("/speed.jsp").forward(request, response);
    }
}
