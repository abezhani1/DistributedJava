package simple;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "SimpleServlet")
public class SimpleServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<html><head></head><body><h1>Simple Web Page</h1><p>The Test.");
        out.println(request.getParameter("message"));

        //This text was inserted (copy/pasted) from the main class of the student program
        Students theStudents = new Students();

        ArrayList<Individual> result;

        result = theStudents.findStudents(FindColumns.ACCTNUM, "25");
        out.println("<table border='1'><tr><th>Account Number</th><th>First Name</th><th>Last Name</th>");
        for (Individual i: result)
        {
            out.println("<tr>"+"<td>"+ i.getAccountNumber() + "</td>" + " " + "<td>" + i.getFname() + "</td>" + " " + "<td>" +
                    i.getLname() + "</td>"+"</tr>");
        }
        //This text was inserted (copy/pasted) from the main class of the student program
        out.println("</table>");
        out.println("</p></body></html>");
    }


}