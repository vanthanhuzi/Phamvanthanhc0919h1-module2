import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "Calculator" , urlPatterns = "/display-discount")
public class CalculatorDiscountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("listPrice"));
        int discountPercent = Integer.parseInt(request.getParameter("discountPercent"));
        float discount =(float) (price*discountPercent*0.01);
        float total = price - discount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> Product Description" + description);
        writer.println("<h1> List Price "+ price);
        writer.println("<h1> Discount Percent" + discountPercent);
        writer.println("<h1> Discount " + discount);
        writer.println("<h1> Total " + total);
        writer.println("<html>");


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
