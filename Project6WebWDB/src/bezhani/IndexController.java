package bezhani;

import bezhani.Weapon;
import bezhani.WeaponList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
//HOME CONTROLLER EQUIVALENT
public class IndexController extends HttpServlet
{
    private String RESULT_PAGE = "index2.jsp";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)

    throws ServletException, IOException
    {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html");

        WeaponList shop = new WeaponList();

        List<Weapon> result = shop.getFeaturedItemCatalog();

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
