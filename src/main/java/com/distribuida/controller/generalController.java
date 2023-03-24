package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.entities.Eventos;
import com.distribuida.entities.Usuario;
import com.distribuida.service.EventosService;
import com.distribuida.service.UsuarioService;

@Controller
@RequestMapping("/general")
public class generalController {
	
	
	
	@RequestMapping("/dasboard")
	public String dasboard() {
	return "dasboard";
	
	}
	
	@RequestMapping("/mi-cuenta")
	public String micuenta() {
	return "mi-cuenta";
	
	}

}
