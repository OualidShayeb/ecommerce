package com.ecommerce.controllers;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.models.Category;
import com.ecommerce.services.category.CategoryServiceImpl;

/**
 * Servlet implementation class AddCategory
 */
@WebServlet("AddCategory")
public class AddCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	CategoryServiceImpl categoryService;

	public AddCategory() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/views/add_category.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String designation = request.getParameter("designation");
		String description = request.getParameter("description");
		Category category = new Category(name,designation,description);
		categoryService.addCategory(category);
		doGet(request, response);
	}

}
