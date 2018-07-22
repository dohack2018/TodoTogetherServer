package de.todotogether.controller;

import de.todotogether.bean.User;
import de.todotogether.bean.Todo;

import java.util.List;

import de.todotogether.service.ITodoService;
import de.todotogether.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController
{
		@Autowired
		private IUserService userservice;
		private ITodoService todoservice;
		
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