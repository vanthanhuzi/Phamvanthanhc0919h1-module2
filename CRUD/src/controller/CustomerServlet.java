package controller;

import Dao.CustomerDao;
import Model.Customer;
 import java.lang.NullPointerException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/")
public class CustomerServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getServletPath();
        switch (action) {
            case "/create":
                createNewCustomer(request, response);
                break;
            case "/update":
                editCustomer(request,response);
                break;
            default:
                listCustomer(request,response);
        }
    }




    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getServletPath();

        switch (action) {
            case "/deleted":
                deletedCustomer(request, response);
                break;
            case "/new":
                showFormNewCustomer(request, response);
                break;
            case "/edit":
                showEditCustomer(request,response);
                break;
            default:
                listCustomer(request, response);
        }
    }
    private void editCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer updateCustomer = new Customer(id,name,email,address);
        CustomerDao.addNewCustomer(updateCustomer);
        response.sendRedirect("list");

    }

    private void showEditCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer editCustomer = CustomerDao.getCustomer(id);
        request.setAttribute("customer", editCustomer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/edit.jsp");
        requestDispatcher.forward(request,response);

    }

    private void createNewCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer checkCustomer = CustomerDao.getCustomer(id);
        if(checkCustomer == null){
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String address = request.getParameter("email");
            Customer newCustomer = new Customer();
            newCustomer.setId(id);
            newCustomer.setName(name);
            newCustomer.setEmail(email);
            newCustomer.setAddress(address);
            CustomerDao.addNewCustomer(newCustomer);
            response.sendRedirect("/");
        }
        else {
            String message = "Already exist, you try again!";
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String address = request.getParameter("email");
            Customer exitCustomer = new Customer(id,name,email,address);
            request.setAttribute("message", message);
            request.setAttribute("customer", exitCustomer);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/new.jsp");
            requestDispatcher.forward(request,response);

        }
    }

    private void showFormNewCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/new.jsp");
        requestDispatcher.forward(request, response);
    }


    private void deletedCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int idCustomer = Integer.parseInt(request.getParameter("id"));
        CustomerDao.deleted(idCustomer);
        response.sendRedirect("/");

    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = CustomerDao.allCustomer();
        request.setAttribute("customerList", customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
