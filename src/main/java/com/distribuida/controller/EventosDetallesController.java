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
import com.distribuida.entities.EventosDetalles;
import com.distribuida.entities.Usuario;
import com.distribuida.service.EventosDetallesService;
import com.distribuida.service.EventosService;
import com.distribuida.service.UsuarioService;
@Controller
@RequestMapping("/eventosDetalles")
public class EventosDetallesController {
	@Autowired
	private EventosDetallesService eventosDetallesService;
	
	
	@RequestMapping
	public String findAll(Model model) {
	List<EventosDetalles> eventosDetalles = eventosDetallesService.findAll();
	
	model.addAttribute("eventosDetalles",eventosDetalles);
	
	return "listar-eventosDetalles";
	
	}
	
	@GetMapping("/findOne")
	public String findOne(@RequestParam("id")int id, @RequestParam("opcion") int opcion, Model model) {
		
		EventosDetalles eventosDetalles = eventosDetallesService.findOne(id);
		if(opcion==1) {
			model.addAttribute("eventosDetalles",eventosDetalles);
			return "agregar-eventosDetalles";
			
			
		}else {
			model.addAttribute("eventosDetalles",eventosDetalles);
			return "eliminar-eventosDetalles";
		}
	}
	
	
	@PostMapping("/add")
	public String add(@ModelAttribute("eventosDetalles") EventosDetalles eventosDetalles, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) { 
			eventosDetallesService.add(eventosDetalles);
			return "agregar-eventosDetalles";
		} else {
			eventosDetallesService.add(eventosDetalles);
			return "redirect:/eventosDetalles";
		}
	}
	
	@RequestMapping("/del")
	public String frmDel(@RequestParam("id")int id) {
		eventosDetallesService.del(id);
		return "redirect:/eventosDetalles";
	}
	
	@RequestMapping("/agregar")
	public String frmAdd(Model model) {
		EventosDetalles eventosDetalles = new EventosDetalles();
		model.addAttribute("eventosDetalles", eventosDetalles);
		return "agregar-eventosDetalles";
	}
	

	@InitBinder
		public void miBinder(WebDataBinder binder) {
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimmerEditor);  
	}
}
