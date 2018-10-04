package bezhani;

import bezhani.Weapon;
import bezhani.WeaponList;

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

    private List<Weapon> items = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Cookie cookie = null;
        Cookie[] cookies = null;
        // Get an array of Cookies associated with the this domain
        cookies = request.getCookies();
        PrintWriter out = response.getWriter();
        List<Weapon> items = new ArrayList();
        items.add(new Weapon(0," ",0.0," "));
        if( cookies != null )
        {
            for (int i = 0; i < cookies.length; i++)
            {
                cookie = cookies[i];
                out.print(cookie.getValue());
                if (cookie.getName().equals("cartItem"))
                {
                    items = orderedItems( cookie.getValue( ));

                }
            }
        }

        request.setAttribute("catalog", items);

        RequestDispatcher view =
                request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
    }

    protected List<Weapon> orderedItems(String itemsNumbers)
    {
        //List<Weapon> items = new ArrayList<>();
        WeaponList cat = new WeaponList();
        String[] nums = itemsNumbers.split(",");
        for (int i=0;i<nums.length;i++)
        {
            items.add(cat.getSingleItem(Integer.parseInt(nums[i])));
        }

        return items;
    }
}
