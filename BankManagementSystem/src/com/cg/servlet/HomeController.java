package com.cg.servlet;

import java.io.IOException;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.BankBean;
import com.cg.service.BankManageServiceImpl;
import com.cg.service.IBankservice;




@WebServlet("*.obj")
public class HomeController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		BankBean bean=new BankBean();
		IBankservice service=new BankManageServiceImpl();
		String path= request.getServletPath();
		String target=null;
	
	
		
		switch(path)
		{
		case "/add.obj":
		{
			target="NewCustomer.html";
		}
		break;
		case "/insert.obj": 
		
			String customerName=request.getParameter("custname");
			String phoneNo=request.getParameter("custphone");
			String password=request.getParameter("pwd");
			String repassword=request.getParameter("repwd");
			
			
			bean.setCustomerName(customerName);
			bean.setPhoneNo(phoneNo);
			bean.setPassword(password);
			bean.setRepassword(repassword);
			
			
			int res = 0;
			res = service.addDetails(bean);
			System.out.println(res);
			
			HttpSession session=request.getSession();
			session.setAttribute("seqid", res);
			target="Success.jsp";
			break;
			
		case "/pay.obj":
			{
			target="Payment.jsp";
			break;
			
			}
		case "/result.obj":
		{
		 
		 String cal=request.getParameter("amount");
		 int pay=Integer.parseInt(cal);
		 int paid=(1000-pay);
		 HttpSession session1=request.getSession();
			session1.setAttribute("paid", paid);
			target="Payment1.jsp";
		}
		}
		RequestDispatcher re=request.getRequestDispatcher(target);
		re.forward(request, response);
		
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
