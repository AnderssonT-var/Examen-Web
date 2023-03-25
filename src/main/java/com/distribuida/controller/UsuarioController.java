
package com.distribuida.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
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


import com.distribuida.entities.Usuario;
import com.distribuida.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	
	@RequestMapping
	public String findAll(Model model) {
	List<Usuario> usuarios = usuarioService.findAll();
	
	model.addAttribute("usuarios",usuarios);
	
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
	
	///////VALIDAR CEDULA ECUATORIANA/////
	public static boolean validarCedulaEcuatoriana(String cedula) {
	    if (cedula == null || cedula.length() != 10) {
	        return false;
	    }
	    
	    // Verificar que los primeros dos dígitos corresponden a un número de provincia válido
	    int provincia = Integer.parseInt(cedula.substring(0, 2));
	    if (provincia < 1 || provincia > 24) {
	        return false;
	    }
	    
	    // Verificar que el tercer dígito es un número válido
	    int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
	    if (tercerDigito < 0 || tercerDigito > 5) {
	        return false;
	    }
	    
	    // Verificar que los últimos dígitos forman un número válido utilizando el algoritmo de Luhn
	    int suma = 0;
	    int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
	    for (int i = 0; i < coeficientes.length; i++) {
	        int digito = Integer.parseInt(cedula.substring(i, i + 1));
	        int producto = coeficientes[i] * digito;
	        if (producto > 9) {
	            producto -= 9;
	        }
	        suma += producto;
	    }
	    int ultimoDigito = Integer.parseInt(cedula.substring(9, 10));
	    int digitoVerificador = (10 - (suma % 10)) % 10;
	    return ultimoDigito == digitoVerificador;
	}
	///////////validar correo//////
	public boolean validarCorreo(String correo) {
	    // Expresión regular para validar el correo electrónico
	    String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

	    // Validar el correo electrónico con la expresión regular
	    return correo.matches(regex);
	}
	@PostMapping("/add")
	public String add(@ModelAttribute("usuario") Usuario usuario, BindingResult bindingResult) {
		
	    
		if (!validarCorreo(usuario.getCorreo())) {
		    bindingResult.rejectValue("correo", "error.correo", "Correo electrónico inválido");
		    return "agregar-usuarios";
		}
		
		List<Usuario> usuarios = usuarioService.findAll();

		// Comparar cada usuario con el usuario que se está intentando agregar
		for (Usuario u : usuarios) {
		    if (u.getCedula().equals(usuario.getCedula()) || u.getNombre1().equals(usuario.getNombre1()) || u.getCorreo().equals(usuario.getCorreo()) ) {
		        // Usuario existente encontrado, mostrar mensaje de error y no agregar el usuario nuevo
		        bindingResult.rejectValue("nombre1", "error.nombre1", "Ya existe un usuario registrado con estos datos");
		        return "agregar-usuarios";
		    }
		}
	
		if (validarCedulaEcuatoriana(usuario.getCedula())) {
			 // Obtener la lista de usuarios existentes
			
		if(bindingResult.hasErrors()) { 
			usuarioService.add(usuario);
			return "agregar-usuarios";
		} else {
			usuarioService.add(usuario);
			return "redirect:/usuarios";
		}
		} else {
	        // Cédula inválida, mostrar mensaje de error
	        bindingResult.rejectValue("cedula", "error.cedula", "Cédula inválida");
	        return "agregar-usuarios";
	    }
		
	    
		
	}
	
	@RequestMapping("/del")
	public String frmDel(@RequestParam("idUsuario")int id) {
		usuarioService.del(id);
		return "redirect:/usuarios";
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
