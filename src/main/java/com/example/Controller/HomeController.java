package com.example.Proyecto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Proyecto.model.Producto;
import com.example.Proyecto.service.IProductosService;

@Controller
public class HomeController {
	
	@Autowired
	private IProductosService serviceProductos;
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		List<Producto> lista = serviceProductos.buscarTodos();
		model.addAttribute("productos", lista);
		
		return "tabla";

   }
}