package servlet;

import calculation.TimeCalculation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TimeServlet", urlPatterns = {"/calculatedTime"})
public class TimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/time.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String seconds = request.getParameter("seconds");
        String minutes = request.getParameter("minutes");
        String hours = request.getParameter("hours");
        String days = request.getParameter("days");

        if(minutes.isEmpty() && hours.isEmpty() && days.isEmpty()){
            double resultMinutes = TimeCalculation.calculateSecondsToMinutes(Double.parseDouble(seconds));
            double resultHours = TimeCalculation.calculateSecondsToHours(Double.parseDouble(seconds));
            double resultDays = TimeCalculation.calculateSecondsToDays(Double.parseDouble(seconds));

            request.setAttribute("seconds", seconds);
            request.setAttribute("minutes", resultMinutes);
            request.setAttribute("hours", resultHours);
            request.setAttribute("days", resultDays);
        }

        if(seconds.isEmpty() && hours.isEmpty() && days.isEmpty()){
            double resultSeconds = TimeCalculation.calculateMinutesToSeconds(Double.parseDouble(minutes));
            double resultHours = TimeCalculation.calculateMinutesToHours(Double.parseDouble(minutes));
            double resultDays = TimeCalculation.calculateMinutesToDays(Double.parseDouble(minutes));

            request.setAttribute("seconds", resultSeconds);
            request.setAttribute("minutes", minutes);
            request.setAttribute("hours", resultHours);
            request.setAttribute("days", resultDays);
        }

        if(seconds.isEmpty() && minutes.isEmpty() && days.isEmpty()){
            double resultSeconds = TimeCalculation.calculateHoursToSeconds(Double.parseDouble(hours));
            double resultMinutes = TimeCalculation.calculateHoursToMinutes(Double.parseDouble(hours));
            double resultDays = TimeCalculation.calculateHoursToDays(Double.parseDouble(hours));

            request.setAttribute("seconds", resultSeconds);
            request.setAttribute("minutes", resultMinutes);
            request.setAttribute("hours", hours);
            request.setAttribute("days", resultDays);
        }

        if(seconds.isEmpty() && minutes.isEmpty() && hours.isEmpty()){
            double resultSeconds = TimeCalculation.calculateDaysToSeconds(Double.parseDouble(days));
            double resultMinutes = TimeCalculation.calculateDaysToMinutes(Double.parseDouble(days));
            double resultHours = TimeCalculation.calculateDaysToHours(Double.parseDouble(days));

            request.setAttribute("seconds", resultSeconds);
            request.setAttribute("minutes", resultMinutes);
            request.setAttribute("hours", resultHours);
            request.setAttribute("days", days);
        }

        getServletContext().getRequestDispatcher("/time.jsp").forward(request, response);
    }
}
