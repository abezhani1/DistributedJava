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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<html><head></head><body><h1>Simple Web Page</h1><p>The Test.");
        out.println(request.getParameter("message"));

        //This text was inserted (copy/pasted) from the main class of the student program 9/5=18
        Students theStudents = new Students();

        ArrayList<Individual> result;
        String searchvalue = request.getParameter("searchtext");
        String findvalue = request.getParameter("parameter");
        FindColumns cols = null;
        switch(findvalue)
            {
                case "Account Number": cols = FindColumns.ACCTNUM;
                break;

                case "Last Name": cols = FindColumns.LNAME;
                break;

                case "First Name": cols = FindColumns.FNAME;
                break;

                case "E-Mail": cols = FindColumns.EMAIL;
                break;

                case "iPadDr": cols = FindColumns.IPADDR;
                break;
            }

        result = theStudents.findStudents(cols, searchvalue);
        out.println("<table border='1'><tr><th>Account Number</th><th>First Name</th><th>Last Name</th><th>E-Mail</th><th>iPadDr</th>");
        for (Individual i: result)
        {
            out.println("<tr>"+"<td>"+ i.getAccountNumber() + "</td>" + " " + "<td>" + i.getFname() + "</td>" + " " + "<td>" +
                    i.getLname() + "</td>"+ "<td>"+ i.getEmail() + "</td>" +"<td>"+ i.getIpAddress() + "</td>" + "</tr>");
        }
        //This text was inserted (copy/pasted) from the main class of the student program 9/5/18
        out.println("</table>");
        out.println("</p></body></html>");

        /*out.println("</tr>\n</table>\n");
        String fullName = request.getParameter("fname");
        String comicType = request.getParameter("lname");

        out.println("<hr><h3>Using Parameter Names</h3><ul>\n" +
                "  <li><b>full_name</b>: "
                + fullName + "</li>\n" + "  <li><b>comic_type</b>: "
                + comicType + "</li>\n" + "  <li><b>parameter</b>: "
                + company + "</li>\n" + "</ul>\n");
        out.println("</body></html>");*/
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doGet(request,response);
    }


}