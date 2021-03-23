package servlet;

import calculation.LengthCalculation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FeetToMilesServlet", urlPatterns = {"/calculatedMiles"})
public class FeetToMilesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/feet-miles.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String feet = request.getParameter("feet");

        String error;

        if(feet == null || feet.isEmpty()){
            error = "Input box is empty or you didn't provide a valid number";
            request.setAttribute("error", error);
        } else {
            double result = LengthCalculation.calculateFeetToMiles(Double.parseDouble(feet));
            request.setAttribute("result", result);
        }

        request.setAttribute("feet", feet);

        getServletContext().getRequestDispatcher("/feet-miles.jsp").forward(request, response);
    }
}
