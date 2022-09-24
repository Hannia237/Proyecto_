package com.example.Proyecto.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Proyecto.model.Producto;

@Service
public class ProductosServiceImpl implements IProductosService {
	
	private List<Producto> lista = null;
	
	public ProductosServiceImpl() {
		lista = new LinkedList<Producto>();
		
		Producto producto1 = new Producto();
		producto1.setId(1);
		producto1.setImagen("product-1.jpg");
		producto1.setNombre("Samsung Galaxy s5-2015");
		producto1.setDescripcion("El Samsung Galaxy S5 es la quinta generación del Galaxy S, esta vez conservando bastantes aspectos de diseño y características del Galaxy S4, pero agregando funcionalidades como monitor de ritmo cardíaco, sensor dactilar, y resistencia al agua.");
		producto1.setPrecio(999.00);
		producto1.setOferta(899.00);
		
		Producto producto2 = new Producto();
		producto2.setId(2);
		producto2.setImagen("product-2.jpg");
		producto2.setNombre("Nokia Lumia 1320");
		producto2.setDescripcion("El Nokia Lumia 1320 cuenta con 1 GB de memoria RAM y 8 GB para almacenamiento de apps, vídeos, fotos y datos en general. Completando sus características técnicas, en sus tripas encontraremos un procesador Qualcomm MSM8930AB Snapdragon 400 a 1,7 GHz de velocidad.");
		producto2.setPrecio(700.00);
		producto2.setOferta(650.00);
		
		Producto producto3 = new Producto();
		producto3.setId(3);
		producto3.setImagen("product-3.jpg");
		producto3.setNombre("LG Leon 2015");
		producto3.setDescripcion("El LG Leon tiene un tamaño de pantalla de 4,5\" , con una resolución de 1280 x 720. La pantalla es de tipo FWVGA. Tiene una densidad de píxeles de 220 ppp. El LG Leon cuenta con Android como sistema operativo, y en su lanzamiento corre la versión 5.0 Lollipop.");
		producto3.setPrecio(425.00);
		producto3.setOferta(400.00);
		
		Producto producto4 = new Producto();
		producto4.setId(4);
		producto4.setImagen("product-4.jpg");
		producto4.setNombre("Sony microsoft");
		producto4.setDescripcion("10C dispone de una pantalla LCD con una diagonal que crece hasta las 6,71 pulgadas resolución HD+ y un notch en forma de gota, donde está alaojada la cámara frontal de 5 megapíxeles.");
		producto4.setPrecio(700.00);
		producto4.setOferta(650.00);
		
		Producto producto5 = new Producto();
		producto5.setId(5);
		producto5.setImagen("product-5.jpg");
		producto5.setNombre("¡Phone 6");
		producto5.setDescripcion("El Apple iPhone 6 sube la apuesta de Apple con una pantalla de mayor tamaño de 4.7 pulgadas protegida por un cristal ultra resistente, nuevo procesador A8, 16GB, 64GB o 128GB de almacenamiento interno, cámara trasera de 8 megapixels con flash, cámara frontal de 1.2MP, conectividad 4G LTE y iOS 8.");
		producto5.setPrecio(1355.00);
		producto5.setOferta(1200.00);
		
		Producto producto6 = new Producto();
		producto6.setId(6);
		producto6.setImagen("product-6.jpg");
		producto6.setNombre("Samsung galaxy Note 4");
		producto6.setDescripcion("Viene con una pantalla de 5,7 pulgadas Súper AMOLED con resolución de 1440x2560 píxeles. Incorpora un SPen y dos cámaras: una trasera de 16 MP y otra frontal de 3,7 MP para videollamadas. Asimismo, incluye 32 GB de almacenaje ampliable a 128 GB con micro SD card y 3 GB de RAM.");
		producto6.setPrecio(1000.00);
		producto6.setOferta(800.00);
		
		lista.add(producto1);
		lista.add(producto2);
		lista.add(producto3);
		lista.add(producto4);
		lista.add(producto5);
		lista.add(producto6);
		
	}
	
	@Override
	public List<Producto> buscarTodos() {
		return lista;
	}
	
	@Override
	public Producto buscarPorId(Integer idProducto) {
		
		for (Producto p : lista) {
			if(p.getId()==idProducto) {
				return p;
			}
		}
		
		return null;
		
	}

}
