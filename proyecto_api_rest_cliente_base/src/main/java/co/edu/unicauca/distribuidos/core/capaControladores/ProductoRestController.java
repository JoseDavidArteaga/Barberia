package co.edu.unicauca.distribuidos.core.capaControladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.distribuidos.core.fachadaServices.DTO.ProductoDTO;
import co.edu.unicauca.distribuidos.core.fachadaServices.services.IProductoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200",  
 methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE}) 
public class ProductoRestController {

	@Autowired
	private IProductoService productoService;

	@GetMapping("/productos") 
	public List<ProductoDTO> listarProductos() {
		return productoService.findAll();
	}

	@GetMapping("/productos/{id}")
	public ProductoDTO consultarProducto(@PathVariable Integer id) {
		ProductoDTO objProducto = null;
		objProducto = productoService.findById(id);
		return objProducto; 
	}

	@GetMapping("/productos/categoria/{categoria}")
	public List<ProductoDTO> consultarProductosPorCategoria(@PathVariable String categoria) {
		return productoService.findByCategoria(categoria);
	}

	@GetMapping("/categorias")
	public List<String> listarCategorias() {
		return productoService.findDistinctCategorias();
	}

	@PostMapping("/productos")
	public ProductoDTO crearProducto(@RequestBody ProductoDTO producto) {
		ProductoDTO objProducto = null;
		objProducto = productoService.save(producto);
		return objProducto;
	}

	@PutMapping("/productos/{id}")
	public ProductoDTO actualizarProducto(@RequestBody ProductoDTO producto, @PathVariable Integer id) {
		ProductoDTO objProducto = null;
		ProductoDTO productoActual = productoService.findById(id);
		if (productoActual != null) {
			objProducto = productoService.update(id, producto);
		}
		return objProducto;
	}

	@DeleteMapping("/productos/{id}")
	public Boolean eliminarProducto(@PathVariable Integer id) {
		Boolean bandera = false;
		ProductoDTO productoActual = productoService.findById(id);
		if (productoActual != null) {
			bandera = productoService.delete(id);
		}
		return bandera;
	}
}