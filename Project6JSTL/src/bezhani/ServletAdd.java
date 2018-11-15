package bezhani;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletAdd", value = "/ServletAdd")
public class ServletAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String eventNumber = request.getParameter("eventnumber");
        String eventName = request.getParameter("eventname");
        String eventTime = request.getParameter("eventtime");


        EventListExpert theList = new EventListExpert();
        theList.addEvent(eventNumber, eventName, eventTime);


        String site = new String("cart.jsp");
        response.setStatus(response.SC_MOVED_TEMPORARILY);
        response.setHeader("Location", site);
    }
}
