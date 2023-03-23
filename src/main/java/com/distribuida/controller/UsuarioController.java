package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.distribuida.entities.Usuario;
import com.distribuida.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	
	@RequestMapping("/findAll")
	public String findAll(@RequestParam("busqueda") @Nullable String busqueda, ModelMap modelMap) {
	List<Usuario> usuario=usuarioService.findAll();
	if(busqueda == null) {
		busqueda="";
		usuario = usuarioService.findAll();
	}else {
		 usuario= usuarioService.findAll(busqueda);
	}

	modelMap.addAttribute("usuarios",usuario);
	
	return "listar-usuarios";
	
	}
	
	@GetMapping("/findOne")
	public String findOne(@RequestParam("idUsuario")int id, @RequestParam("opcion") int opcion, Model model) {
		
		Usuario usuario = usuarioService.findOne(id);
		if(opcion==1) {
			model.addAttribute("usuario",usuario);
			return "agregar-usuarios";
			
			
		}else {
			model.addAttribute("usuario",usuario);
			return "eliminar-usuarios";
		}
	}
	
	
	
	
	@PostMapping("/add")
	public String add(@ModelAttribute("usuario") Usuario usuario, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) { 
			usuarioService.add(usuario);
			return "agregar-usuarios";
		} else {
			usuarioService.add(usuario);
			return "redirect:/usuarios/findAll";
		}
	}
	
	@RequestMapping("/del")
	public String frmDel(@RequestParam("idUsuario")int id) {
		usuarioService.del(id);
		return "redirect:/usuarios/findAll";
	}
	
	@RequestMapping("/frmAdd")
	public String frmAdd(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		return "agregar-usuarios";
	}


	@InitBinder
		public void miBinder(WebDataBinder binder) {
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimmerEditor);  
	}
}
