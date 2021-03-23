package servlet;

import calculation.WeightCalculation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "WeightServlet", urlPatterns = {"/calculatedWeights"})
public class WeightServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/weight.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String milligram = request.getParameter("milligram");
        String gram = request.getParameter("gram");
        String kilogram = request.getParameter("kilogram");
        String ton = request.getParameter("ton");
        String ounce = request.getParameter("ounce");
        String pound = request.getParameter("pound");

        if(gram.isEmpty() && kilogram.isEmpty() && ton.isEmpty() && ounce.isEmpty() && pound.isEmpty()){
            double resultGram = WeightCalculation.calculateMilligramToGram(Double.parseDouble(milligram));
            double resultKilogram = WeightCalculation.calculateMilligramToKilogram(Double.parseDouble(milligram));
            double resultTon = WeightCalculation.calculateMilligramToTons(Double.parseDouble(milligram));
            double resultOunce = WeightCalculation.calculateMilligramToOunce(Double.parseDouble(milligram));
            double resultPound = WeightCalculation.calculateMillitgamToPound(Double.parseDouble(milligram));

            request.setAttribute("milligram", milligram);
            request.setAttribute("gram", resultGram);
            request.setAttribute("kilogram", resultKilogram);
            request.setAttribute("ton", resultTon);
            request.setAttribute("ounce", resultOunce);
            request.setAttribute("pound", resultPound);
        }

        if(milligram.isEmpty() && kilogram.isEmpty() && ton.isEmpty() && ounce.isEmpty() && pound.isEmpty()){
            double resultMilligram = WeightCalculation.calculateGramToMilligram(Double.parseDouble(gram));
            double resultKilogram = WeightCalculation.calculateGramToKilogram(Double.parseDouble(gram));
            double resultTon = WeightCalculation.calculateGramToTons(Double.parseDouble(gram));
            double resultOunce = WeightCalculation.calculateGramToOunce(Double.parseDouble(gram));
            double resultPound = WeightCalculation.calculateGramToPound(Double.parseDouble(gram));

            request.setAttribute("milligram", resultMilligram);
            request.setAttribute("gram", gram);
            request.setAttribute("kilogram", resultKilogram);
            request.setAttribute("ton", resultTon);
            request.setAttribute("ounce", resultOunce);
            request.setAttribute("pound", resultPound);

        }

        if(milligram.isEmpty() && gram.isEmpty() && ton.isEmpty() && ounce.isEmpty() && pound.isEmpty()){
            double resultMilligram = WeightCalculation.calculateKilogramToMilligram(Double.parseDouble(kilogram));
            double resultGram = WeightCalculation.calculateKilogramToGram(Double.parseDouble(kilogram));
            double resultTon = WeightCalculation.calculateKilogramToTon(Double.parseDouble(kilogram));
            double resultOunce = WeightCalculation.calculateKilogramToOunce(Double.parseDouble(kilogram));
            double resultPound = WeightCalculation.calculateKilogramToPound(Double.parseDouble(kilogram));

            request.setAttribute("milligram", resultMilligram);
            request.setAttribute("gram", resultGram);
            request.setAttribute("kilogram", kilogram);
            request.setAttribute("ton", resultTon);
            request.setAttribute("ounce", resultOunce);
            request.setAttribute("pound", resultPound);
        }

        if(milligram.isEmpty() && gram.isEmpty() && kilogram.isEmpty() && ounce.isEmpty() && pound.isEmpty()){
            double resultMilligram = WeightCalculation.calculateTonToMilligram(Double.parseDouble(ton));
            double resultGram = WeightCalculation.calculateTonToGram(Double.parseDouble(ton));
            double resultKilogram = WeightCalculation.calculateTonToKilogram(Double.parseDouble(ton));
            double resultOunce = WeightCalculation.calculateTonToOunce(Double.parseDouble(ton));
            double resultPound = WeightCalculation.calculateTonToPound(Double.parseDouble(ton));

            request.setAttribute("milligram", resultMilligram);
            request.setAttribute("gram", resultGram);
            request.setAttribute("kilogram", resultKilogram);
            request.setAttribute("ton", ton);
            request.setAttribute("ounce", resultOunce);
            request.setAttribute("pound", resultPound);
        }

        if(milligram.isEmpty() && gram.isEmpty() && kilogram.isEmpty() && ton.isEmpty() && pound.isEmpty()){
            double resultMilligram = WeightCalculation.calculateOunceToMilligram(Double.parseDouble(ounce));
            double resultGram = WeightCalculation.calculateOunceToGram(Double.parseDouble(ounce));
            double resultKilogram = WeightCalculation.calculateOunceToKilogram(Double.parseDouble(ounce));
            double resultTon = WeightCalculation.calculateOunceToTon(Double.parseDouble(ounce));
            double resultPound = WeightCalculation.calculateOunceToPound(Double.parseDouble(ounce));

            request.setAttribute("milligram", resultMilligram);
            request.setAttribute("gram", resultGram);
            request.setAttribute("kilogram", resultKilogram);
            request.setAttribute("ton", resultTon);
            request.setAttribute("ounce", ounce);
            request.setAttribute("pound", resultPound);
        }

        if(milligram.isEmpty() && gram.isEmpty() && kilogram.isEmpty() && ton.isEmpty() && ounce.isEmpty()){
            double resultMilligram = WeightCalculation.calculatePoundToMilligram(Double.parseDouble(pound));
            double resultGram = WeightCalculation.calculatePoundToGram(Double.parseDouble(pound));
            double resultKilogram = WeightCalculation.calculatePoundToKilogram(Double.parseDouble(pound));
            double resultTon = WeightCalculation.calculatePoundToTon(Double.parseDouble(pound));
            double resultOunce = WeightCalculation.calculatePoundToOunce(Double.parseDouble(pound));

            request.setAttribute("milligram", resultMilligram);
            request.setAttribute("gram", resultGram);
            request.setAttribute("kilogram", resultKilogram);
            request.setAttribute("ton", resultTon);
            request.setAttribute("ounce", resultOunce);
            request.setAttribute("pound", pound);
        }


        getServletContext().getRequestDispatcher("/weight.jsp").forward(request, response);
    }
}
