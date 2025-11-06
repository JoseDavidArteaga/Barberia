package co.edu.unicauca.distribuidos.core.fachadaServices.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductoDTO {
	private Integer id;
	private String nombre;
	private String descripcion;
	private Double precio;
	private String categoria;
	private String imagen;
	private Date createAt;

	public ProductoDTO() {

	}
}