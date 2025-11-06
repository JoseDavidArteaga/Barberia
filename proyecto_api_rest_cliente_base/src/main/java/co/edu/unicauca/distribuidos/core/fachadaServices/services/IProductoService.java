package co.edu.unicauca.distribuidos.core.fachadaServices.services;

import java.util.List;

import co.edu.unicauca.distribuidos.core.fachadaServices.DTO.ProductoDTO;

public interface IProductoService {
    
    public List<ProductoDTO> findAll();
    public ProductoDTO findById(Integer id);
    public ProductoDTO save(ProductoDTO producto);
    public ProductoDTO update(Integer id, ProductoDTO producto);
    public boolean delete(Integer id);
    public List<ProductoDTO> findByCategoria(String categoria);
    public List<String> findDistinctCategorias();
}