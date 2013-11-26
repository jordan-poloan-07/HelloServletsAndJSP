package com.jordan.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jordan.model.TheImbaModel;

public class Jordan extends HttpServlet {

	private static final long serialVersionUID = -8709424799083592606L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		/**
		 * won't be used anymore because of JSP
		 * response.setContentType("text/html"); PrintWriter out =
		 * response.getWriter(); out.println("Datatype Selection Advice<br>
		 * ");
		 **/

		String d = request.getParameter("datatype");

		TheImbaModel tim = new TheImbaModel(d);

		List<String> list = tim.getStringsToDisplay();

		/**
		 * for (String word : list) { out.println("<br>
		 * Got jordan's datatype " + word); }
		 **/

		request.setAttribute("datatypes", list);

		RequestDispatcher viewJSP = request
				.getRequestDispatcher("views/datatypes.jsp");

		viewJSP.forward(request, response);
	}
}
