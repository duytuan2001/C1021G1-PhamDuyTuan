package controller;

import model.Category;
import model.Product;
import repository.product.ICategoryRepository;
import repository.product.IProductRepository;
import repository.product.impl.CategoryRepositoryImpl;
import repository.product.impl.ProductRepositoryImpl;
import service.ICategoryService;
import service.IProductService;
import service.impl.CategoryServiceImpl;
import service.impl.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {

    private static ICategoryService iCategoryService = new CategoryServiceImpl();
    private static IProductService iProductService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showProduct(request, response);
                break;
            case "edit":
                showEdit(request, response);
                break;
            case "search":
                showSearch(request,response);
                break;
            default:
                listProduct(request, response);
                break;
        }
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products = iProductService.getAllProduct();
        request.setAttribute("products", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Category> categoryList = iCategoryService.getAllCategory();
        request.setAttribute("categoryList", categoryList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }


    private void showEdit(HttpServletRequest request, HttpServletResponse response) {

    }

    private void showSearch(HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                editCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;

        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("product_name");
        double price  = Double.parseDouble(request.getParameter("price"));
        int quality = Integer.parseInt(request.getParameter("quality"));
        String color = request.getParameter("color");
        int idCategory = Integer.parseInt(request.getParameter("category_id"));
        Product product = new Product(name, price, quality, color, idCategory);
        iProductService.createProduct(product);
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {

    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {

    }
}
