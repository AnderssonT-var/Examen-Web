package com.distribuida.controller;

import java.util.Date;
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
	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private EventosService eventosService;
	
//	@RequestMapping
//	public String findAll(Model model) {
//	List<EventosDetalles> eventosDetalles = eventosDetallesService.findAll();
//
//	model.addAttribute("eventosDetalles",eventosDetalles);
//     return "listar-eventosDetalles";
//	
//	}
	
	
	@RequestMapping("/findAll")
	public String findAll(Model model) {
	List<EventosDetalles> eventosDetalles = eventosDetallesService.findAll();
	List<Usuario> usuario = usuarioService.findAll();
	List<Eventos> eventos = eventosService.findAll();



	model.addAttribute("eventosDetalles",eventosDetalles);
	   model.addAttribute("usuario", usuario);
	   model.addAttribute("eventos", eventos);


     return "listar-eventosDetalles";
	
	}
	
	
	
	
	@RequestMapping("/findAllUsuario")
	public String findAll1(@RequestParam("eventos") @Nullable int busqueda, ModelMap modelMap) {
//	if(busqueda == null) busqueda="";
//	 
//	List<EventosDetalles> eventosDetalles = eventosDetallesService.findAll(busqueda);
//	List<Usuario> usuario = usuarioService.findAll(busqueda);

//    List<Eventos> eventos=eventosService.findAll(busqueda);
//    Eventos evento=eventos.get(0);
	//List<EventosDetalles> eventosDetalles =eventosDetallesService.findAll(1003);
	List<EventosDetalles> eventosDetalles =eventosDetallesService.findAll(busqueda);
 

//     if(busqueda == null) {
//	   busqueda=0;
//		   //eventosDetalles =eventosDetallesService.findAll(busqueda);
//
//}
//	   }else {
//	   List<Eventos>eventos= eventosService.findAll(busqueda);
//	   Eventos evento=eventos.get(0);
//	   
//	    eventosDetalles= eventosDetallesService.findAll(evento.getNombre());
//	   }
// 
	modelMap.addAttribute("eventosDetalles",eventosDetalles);
	//modelMap.addAttribute("usuario",usuario);

	List<Usuario> usuario = usuarioService.findAll();
	List<Eventos> eventos = eventosService.findAll();
	modelMap.addAttribute("usuario", usuario);
	 modelMap.addAttribute("eventos", eventos);

	
	return "listar-eventosDetalles";
	}

	
	
	

	@RequestMapping("/findAllUsuario2")
	public String findAll2(@RequestParam("usuario") @Nullable int busqueda, ModelMap modelMap) {
//	if(busqueda == null) busqueda="";
//	 
//	List<EventosDetalles> eventosDetalles = eventosDetallesService.findAll(busqueda);
//	List<Usuario> usuario = usuarioService.findAll(busqueda);

//    List<Usuario> usuarios=usuarioService.findAll(busqueda);
//    Usuario usuario=usuarios.get(0);
//	List<EventosDetalles> eventosDetalles =eventosDetallesService.findAll(1003);
	List<EventosDetalles> eventosDetalles =eventosDetallesService.findAll1(busqueda);


//     if(busqueda == null) {
//	   busqueda=0;
//		   //eventosDetalles =eventosDetallesService.findAll(busqueda);
//}
//	   }else {
//	   List<Eventos>eventos= eventosService.findAll(busqueda);
//	   Eventos evento=eventos.get(0);
//	   
//	    eventosDetalles= eventosDetallesService.findAll(evento.getNombre());	
//	    }
	modelMap.addAttribute("eventosDetalles",eventosDetalles);	

	
	List<Usuario> usuario = usuarioService.findAll();
	List<Eventos> eventos = eventosService.findAll();
	modelMap.addAttribute("usuario", usuario);
	 modelMap.addAttribute("eventos", eventos);
	
 
	return "listar-eventosDetalles";
	}

	
	
	
	
	
	
//
//	@RequestMapping("/findAllUsuario2")
//	public String findAll2(@RequestParam("busqueda") @Nullable int busqueda, ModelMap modelMap) {
////	if(busqueda == null) busqueda="";
////	 
////	List<EventosDetalles> eventosDetalles = eventosDetallesService.findAll(busqueda);
////	List<Usuario> usuario = usuarioService.findAll(busqueda);
//
////    List<Usuario> usuarios=usuarioService.findAll(busqueda);
////    Usuario usuario=usuarios.get(0);
////	List<EventosDetalles> eventosDetalles =eventosDetallesService.findAll(1003);
//	List<EventosDetalles> eventosDetalles =eventosDetallesService.findAll1(usuario.getIdUsuario());
//
//
////     if(busqueda == null) {
////	   busqueda=0;
////		   //eventosDetalles =eventosDetallesService.findAll(busqueda);
////}
////	   }else {
////	   List<Eventos>eventos= eventosService.findAll(busqueda);
////	   Eventos evento=eventos.get(0);
////	   
////	    eventosDetalles= eventosDetallesService.findAll(evento.getNombre());	
////	    }
//	modelMap.addAttribute("eventosDetalles",eventosDetalles);	
//
//	
// 
//	return "listar-eventosDetalles";
//	}
	
//	 @GetMapping("/listar")
//	   
//	   public String listar(@RequestParam("busqueda")@Nullable String busqueda,ModelMap modelMap) {
//		   if(busqueda == null) busqueda="";
//
//		  
//		   List<Usuario> usuarios= usuarioService.findAll(busqueda);
//		   List<Eventos> eventos= eventosService.findAll(busqueda);
//
//		   Usuario usuario=usuarios.get(0);
//		   Eventos evento=eventos.get(0);
//
//		   
//		   EventosDetalles eventosDetalles=new EventosDetalles();
//		   //eventosDetalles.setFecha(new Date());
//		   
//		   modelMap.addAttribute("usuario", usuario);
//		   modelMap.addAttribute("evento", evento);
//		   modelMap.addAttribute("eventosDetalles", eventosDetalles);
//
//
//		   return "eventosDetalles";
//	   }
	
	 
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
