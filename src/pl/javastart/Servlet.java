package pl.javastart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculator")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String number1 = request.getParameter("number1");
        String number2 = request.getParameter("number2");
        String operation = request.getParameter("operation");
        if (operation.equals("dodaj")) {
            System.out.println("Wynik dodawania: "+ Integer.valueOf(number1) + Integer.valueOf(number2));
        }
        if (operation.equals("odejmij")) {
            System.out.println("Wynik odejmowania: "+Double.valueOf(number1) + Double.valueOf(number2));
        }
        if (operation.equals("pomnoz")) {
            System.out.println("Wynik mnozenia: "+Double.valueOf(number1) * Double.valueOf(number2));
        }
        if (operation.equals("podziel")) {
            System.out.println("Wynik dzielenia: "+Double.valueOf(number1) / Double.valueOf(number2));
        }
    }

}
