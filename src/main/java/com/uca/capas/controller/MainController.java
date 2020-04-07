package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Usuario;

@Controller

public class MainController {

	@GetMapping("/login")
	public String enviarForm(Usuario usuario) {
		return "Login";
	}

	@PostMapping("/validacion")
	public String procesarForm(Usuario usuario) {
		// Credenciales-> Nombre: Jose Contra=1234
		System.out.println(usuario.getNombre());
		if (usuario.getNombre().equals("Jose") && usuario.getContrasenia().equals("1234"))
			return "MostrarMensajeV";
		else
			return "MostrarMensajeF";
	}

}
