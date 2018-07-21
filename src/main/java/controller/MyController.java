package src.main.java.controller;	

import src.main.java.bean.User;
import src.main.java.bean.Todo;
import src.main.java.service.iUserService;
import src.main.java.service.iTodoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController
{
		@Autowired
		private iUserService userservice;
		private iTodoService todoservice;
		
		@GetMapping("/showUser")
		public String findUser(Model model)
		{
				List<User> users = (List<User>) userservice.findAll();
				model.addAttribute("users", users);
				return "showUser";
		}
		
		@GetMapping("/showTodo")
		public String findTodo(Model model)
		{
				List<Todo> todos = (List<Todo>) todoservice.findAll();
				model.addAttribute("todos", todos);
				return "showTodo";
		}
}