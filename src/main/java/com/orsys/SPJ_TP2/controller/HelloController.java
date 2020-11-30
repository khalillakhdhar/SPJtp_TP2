package com.orsys.SPJ_TP2.controller;
import com.orsys.model.User;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value="/hello" )
	public String display(HttpServletRequest req,Model m)
	{
	//read the provided form data
	String name=req.getParameter("name");
	String pass=req.getParameter("pass");
	User us=new User(name, pass);
	String msg=us.verif();
	m.addAttribute("message", msg);

	return "viewpage";
	/*if(pass.equals("admin"))
	{
	String msg="Hello "+ name;
	//add a message to the model
	m.addAttribute("message", msg);
	return "viewpage";
	}
	else
	{
	String msg="désolé "+ name+". mot de passe incorrecte";
	m.addAttribute("message", msg);
	return "errorpage";
	}
	*/
	}
}
