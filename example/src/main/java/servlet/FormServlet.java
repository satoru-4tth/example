package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Formservlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		// リクエストパラメータ取得
		// request.setCharacterEncoding("UTF-8")
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
	}
}
// gitのアカウントどれだ