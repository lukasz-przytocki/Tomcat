package pl.jakMaszNaImie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String age = request.getParameter("age");
       // System.out.printf("Cześć %s. Wiem że masz na nazwisko %s. Kiedyś też miałem %d",name,surname,Integer.valueOf(age));


        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        if("surname".isEmpty()&& "age".isEmpty())
            writer.printf("Cześć %s. Wiem że masz na nazwisko %s. Kiedyś też miałem %d",name,surname,Integer.valueOf(age));
        else
        writer.printf("Cześć %s. Wiem że masz na nazwisko %s. Kiedyś też miałem %d",name,surname,Integer.valueOf(age));
    }
}
