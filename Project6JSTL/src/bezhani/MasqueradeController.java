package bezhani;

import bezhani.Masquerade;
import bezhani.EventList;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.util.List;
import javax.servlet.RequestDispatcher;
//CATALOG CONTROLLER EQUIVALENT
public class MasqueradeController extends HttpServlet
{
    private String RESULT_PAGE = "catalog.jsp";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        EventList slot = new EventList();

        List<Masquerade> result = slot.getEventCatalog();

        request.setAttribute("catalog", result);

        RequestDispatcher view =
                request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Main Controller";
    }

}