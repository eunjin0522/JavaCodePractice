package kh.mclass.jdbc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.mclass.jdbc.model.service.SalgradeService;
import kh.mclass.jdbc.model.vo.Salgrade;

/**
 * Servlet implementation class SalgradeController
 */
@WebServlet("/salgradelist")
public class SalgradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SalgradeController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SalgradeService service = new SalgradeService(); //SalgradeService 객체 생성
		List<Salgrade> result = service.selectList(); //selectlList의 리턴값 list에 담기
		//System.out.println(list); //println 없이 출력이 가능하다..? -> console창에 출력하는 것
		if (result != null) {
			request.setAttribute("volist", result);
			request.getRequestDispatcher("/views/salgradelist.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "리스트가 null값이므로 출력 못 함");
			request.getRequestDispatcher("/views/errorPage.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
