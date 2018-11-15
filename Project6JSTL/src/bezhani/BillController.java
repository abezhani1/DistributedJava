package bezhani;

import bezhani.Masquerade;
import bezhani.EventList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class BillController extends HttpServlet {

    private String RESULT_PAGE = "bill.jsp";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    private List<Masquerade> events = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Cookie cookie = null;
        Cookie[] cookies = null;
        cookies = request.getCookies();
        PrintWriter out = response.getWriter();
        List<Masquerade> events = new ArrayList();
        events.add(new Masquerade(""," "," "));
        if( cookies != null )
        {
            for (int i = 0; i < cookies.length; i++)
            {
                cookie = cookies[i];
                out.print(cookie.getValue());
                if (cookie.getName().equals("cartItem"))
                {
                    events = orderedItems( cookie.getValue( ));
                }
            }
        }

        request.setAttribute("catalog", events);

        RequestDispatcher view =
                request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
    }

    protected List<Masquerade> orderedItems(String itemsNumbers)
    {
        EventList cat = new EventList();
        String[] nums = itemsNumbers.split(",");
        for (int i=0;i<nums.length;i++)
        {
            events.add(cat.getSingleEvent((nums[i])));
        }

        return events;
    }
}
