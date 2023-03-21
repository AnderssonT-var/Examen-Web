package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
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

import com.distribuida.entities.Ciudades;
import com.distribuida.entities.Eventos;
import com.distribuida.entities.EventosDetalles;
import com.distribuida.entities.Usuario;
import com.distribuida.service.CiudadesService;
import com.distribuida.service.EventosDetallesService;
import com.distribuida.service.EventosService;
import com.distribuida.service.UsuarioService;

@Controller
@RequestMapping("/eventos")
public class EventosController {
	@Autowired
	private EventosService eventosService;
	@Autowired
	private EventosDetallesService eventosDetallesService;
	
	@Autowired
	private CiudadesService ciudadesService;
	
	@RequestMapping("/findAll")
	public String findAll(Model model) {
	List<Eventos> eventos = eventosService.findAll();
	
	model.addAttribute("eventos",eventos);
	
	return "listar-eventos";
	
	}
	
	@GetMapping("/findOne")
	public String findOne(@RequestParam("id")int id, @RequestParam("opcion") int opcion, ModelMap modelMap) {
		
		Eventos eventos = eventosService.findOne(id);
		if(opcion==1) {
			modelMap.addAttribute("eventos",eventos);
			return "agregar-eventos";
			
			
		}else if(opcion==3) {
		List<Eventos> eventos1 = eventosService.findAll();
		
		List<EventosDetalles> eventosDetalles=eventosDetallesService.findAll(id);

			 double promedio=0.0;
			//promedio=eventosService.promedio(eventosDetalles);
		  eventos1.get(0).setPromedioCalificacion(promedio);
		  

				modelMap.addAttribute("eventos",eventos1);
				return "listar-eventos";

		}else {
			modelMap.addAttribute("eventos",eventos);
			return "eliminar-eventos";
		}
		
	}
	
	
	@PostMapping("/add")
	public String add(@ModelAttribute("eventos") Eventos eventos, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) { 
			//eventosService.add(eventos);
			return "agregar-eventos";
		} else {
			eventosService.add(eventos);
			//eventosService.add(5.032,2);
			return "redirect:/eventos/findAll";
		}
	}
	
	@RequestMapping("/del")
	public String frmDel(@RequestParam("id")int id) {
		eventosService.del(id);
		return "redirect:/eventos/findAll";
	}
	
	@RequestMapping("/agregar")
	public String frmAdd(Model model) {
		Eventos eventos = new Eventos();
//		Ciudades ciudades=new Ciudades();
//		model.addAttribute("ciudades", ciudades);

		model.addAttribute("eventos", eventos);

		return "agregar-eventos";
	}
	
	

	@InitBinder
		public void miBinder(WebDataBinder binder) {
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimmerEditor);  
	}
}
