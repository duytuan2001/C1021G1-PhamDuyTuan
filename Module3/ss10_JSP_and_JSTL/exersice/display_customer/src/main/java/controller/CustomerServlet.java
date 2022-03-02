package controller;

import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer("HaiTT", "1998/01/01", "Đà Nẵng", "https://danangfantasticity.com/wp-content/uploads/2020/03/da-nang-khong-to-chuc-le-ky-niem-45-nam-ngay-giai-phong.jpg"));
        customerList.add(new Customer("TrungDP", "1998/01/01", "Hà Nội", "https://i.ytimg.com/vi/FClS4ni4zfo/maxresdefault.jpg"));
        customerList.add(new Customer("TrungDC", "1998/01/01", "Hồ Chí Minh", "https://lp-cms-production.imgix.net/image_browser/Ho%20Chi%20Minh%20City%20skyline.jpg?auto=format&fit=crop&sharp=10&vib=20&ixlib=react-8.6.4&w=850"));
        customerList.add(new Customer("TienNVT", "1998/01/01", "Cần Thơ","https://media.vneconomy.vn/images/upload/2021/09/01/can-tho-3.jpeg"));

        request.setAttribute("list", customerList);
        request.getRequestDispatcher("customer.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
