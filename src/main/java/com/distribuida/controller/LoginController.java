package com.distribuida.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.distribuida.entities.Logins;
import com.distribuida.entities.LoginsCredentials;
import com.distribuida.entities.Usuario;
import com.distribuida.service.LoginsService;


@Controller
public class LoginController {
	
	@Autowired
	public LoginsService loginsService;
	
	@PostMapping("/login")
	public String login(@RequestParam String usuario, @RequestParam String contrasena, Model model) {
	
		System.out.print(usuario+" "+contrasena);
		
		
		Logins login = loginsService.validar(usuario, contrasena);
		model.addAttribute("usuario", login.getUsuario1());
		return "redirect:/dashboard";
		
	}
	
	@GetMapping ("/dashboard")
	public String dashboard ()
	{
		
		return "dashboard";
		}
	
	@GetMapping ("/mi-cuenta")
	public String micuenta()
	{
		
		return "mi-cuenta";
		}
}
             