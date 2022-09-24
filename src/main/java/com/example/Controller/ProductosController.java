package com.example.Proyecto.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/productos")
public class ProductosController {
	
	@GetMapping("/delete")
	public String eliminar(@RequestParam("id") int idProducto, Model model) {
		model.addAttribute("id", idProducto);
		System.out.println("Borrando producto con id: " + idProducto);
		return "mensaje";
	}

}
