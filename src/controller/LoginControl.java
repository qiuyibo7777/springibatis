package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.Dao;
import entity.User;


@Controller
public class LoginControl{

	public String testLogin(HttpServletRequest request){
		System.out.println("Test");
		return "loginSuccess";
	}
	
	@Autowired
	private Dao dao;
	
	@RequestMapping(value="login.do")
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		String email = arg0.getParameter("email");
		String password = arg0.getParameter("password");
		User user = new User("test","test","test");
		dao.save(user);
		if(email.equals("sa")&&password.equals("sa")){
			return new ModelAndView("ok");
		}
		return new ModelAndView("login");
	}
}
