package com.distribuida.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.entities.Eventos;
import com.distribuida.entities.EventosDetalles;
import com.distribuida.entities.EventosDetallesAnios80;
import com.distribuida.entities.Usuario;
import com.distribuida.service.EventosDetallesAnios80Service;
import com.distribuida.service.EventosDetallesService;
import com.distribuida.service.EventosService;
import com.distribuida.service.UsuarioService;

@Controller
@RequestMapping("/registro")
public class UsuariosEventosController {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private EventosService eventosService;
	
	
	@Autowired
	private EventosDetallesService eventosDetallesService;
	
	@Autowired
	private EventosDetallesAnios80Service eventosDetallesAnios80Service;
	
	
	@RequestMapping("/principal")
	public String principal() {
		
		return "registro";
	}
	
	
	@PostMapping("/add")
	public String add(
			@RequestParam("cedula") @Nullable String cedula,
			@RequestParam("nombre1") @Nullable String nombre1,
			@RequestParam("nombre2") @Nullable String nombre2,	
			@RequestParam("apellido1") @Nullable String apellido1,
			@RequestParam("apellido2") @Nullable String apellido2,
			@RequestParam("fechaNacimiento") @Nullable @DateTimeFormat(pattern ="yyyy-MM-dd") Date fechaNacimiento,	
			@RequestParam("sexo") @Nullable String sexo,
			@RequestParam("correo") @Nullable String correo,
			@RequestParam("color1") @Nullable Integer color1,
			@RequestParam("color2") @Nullable Integer color2,
			@RequestParam("color3") @Nullable Integer color3,
			@RequestParam("color4") @Nullable Integer color4,
			@RequestParam("color5") @Nullable Integer color5,
			@RequestParam("color6") @Nullable Integer color6,
			@RequestParam("color7") @Nullable Integer color7,
			@RequestParam("color8") @Nullable Integer color8,
			@RequestParam("color9") @Nullable Integer color9,
			@RequestParam("color10") @Nullable Integer color10,
			@RequestParam("juego1") @Nullable Integer juego1,
			@RequestParam("juego2") @Nullable Integer juego2,
			@RequestParam("juego3") @Nullable Integer juego3,
			@RequestParam("juego4") @Nullable Integer juego4,
			@RequestParam("juego5") @Nullable Integer juego5,
			@RequestParam("juego6") @Nullable Integer juego6,
			@RequestParam("juego7") @Nullable Integer juego7,
			@RequestParam("juego8") @Nullable Integer juego8,
			@RequestParam("juego9") @Nullable Integer juego9,
			@RequestParam("juego10") @Nullable Integer juego10	
			) {
		
		Usuario usuario = new Usuario(cedula,nombre1,nombre2,apellido1,apellido2,fechaNacimiento,0,sexo, null, null, correo,"Usuario");
		
		
		usuarioService.add(usuario);
		
		Usuario usuario1 = usuarioService.findOne(usuario);
		
		Eventos evento = eventosService.findOne(1);
		
		EventosDetalles eventosDetalles = new EventosDetalles();
		eventosDetalles.setEvento(evento);
		eventosDetalles.setUsuario(usuario1);
		
		eventosDetallesService.add(eventosDetalles);
		
		EventosDetalles eventosDetalles1 = eventosDetallesService.findOne(eventosDetalles);
		
		if(color1 == null) color1=0; if(color2 == null) color2=0; if(color3 == null) color3=0; if(color4 == null) color4=0; if(color5 == null) color5=0; 
		if(color6 == null) color6=0; if(color7 == null) color7=0; if(color8 == null) color8=0; if(color9 == null) color9=0; if(color10 == null) color10=0;
		
		
		if(juego1 == null) juego1=0; if(juego2 == null) juego2=0; if(juego3 == null) juego3=0; if(juego4 == null) juego4=0; if(juego5 == null) juego5=0; 
		if(juego6 == null) juego6=0; if(juego7 == null) juego7=0; if(juego8 == null) juego8=0; if(juego9 == null) juego9=0; if(juego10 == null) juego10=0;
		
		EventosDetallesAnios80 eventosDetallesAnios80 = 
				new EventosDetallesAnios80(color1, color2,color3,color4,color5,color6,color7,color8,color9,color10,juego1,juego2,juego3,juego4,juego5,juego6,juego7,juego8,juego9,juego10,0.0,0.0,0.0);
				
		eventosDetallesAnios80.setEventosDetalles(eventosDetalles1);
		
		eventosDetallesAnios80Service.add(eventosDetallesAnios80);
		
		return "redirect:/usuarios";
	}
	
}
