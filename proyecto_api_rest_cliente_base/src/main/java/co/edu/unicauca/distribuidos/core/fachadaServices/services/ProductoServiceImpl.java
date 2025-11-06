package co.edu.unicauca.distribuidos.core.fachadaServices.services;

import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.distribuidos.core.capaAccesoADatos.models.ProductoEntity;
import co.edu.unicauca.distribuidos.core.capaAccesoADatos.repositories.ProductoRepository;
import co.edu.unicauca.distribuidos.core.fachadaServices.DTO.ProductoDTO;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ProductoDTO> findAll() {
        List<ProductoEntity> productosEntity = this.productoRepository.findAll();
        List<ProductoDTO> productosDTO = this.modelMapper.map(productosEntity, new TypeToken<List<ProductoDTO>>() {}.getType());
        return productosDTO;
    }

    @Override
    public ProductoDTO findById(Integer id) {
        ProductoEntity objProductoEntity = this.productoRepository.findById(id).orElse(null);
        ProductoDTO objProductoDTO = this.modelMapper.map(objProductoEntity, ProductoDTO.class);
        return objProductoDTO;
    }

    @Override
    public ProductoDTO save(ProductoDTO producto) {
        producto.setCreateAt(new Date());
        ProductoEntity objProductoEntity = this.modelMapper.map(producto, ProductoEntity.class);
        ProductoEntity objProductoEntitySaved = this.productoRepository.save(objProductoEntity);
        ProductoDTO objProductoDTO = this.modelMapper.map(objProductoEntitySaved, ProductoDTO.class);
        return objProductoDTO;
    }

    @Override
    public ProductoDTO update(Integer id, ProductoDTO producto) {
        ProductoEntity objProductoEntity = this.modelMapper.map(producto, ProductoEntity.class);
        objProductoEntity.setId(id);
        ProductoEntity objProductoEntitySaved = this.productoRepository.save(objProductoEntity);
        ProductoDTO objProductoDTO = this.modelMapper.map(objProductoEntitySaved, ProductoDTO.class);
        return objProductoDTO;
    }

    @Override
    public boolean delete(Integer id) {
        try {
            this.productoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<ProductoDTO> findByCategoria(String categoria) {
        List<ProductoEntity> productosEntity = this.productoRepository.findByCategoria(categoria);
        List<ProductoDTO> productosDTO = this.modelMapper.map(productosEntity, new TypeToken<List<ProductoDTO>>() {}.getType());
        return productosDTO;
    }

    @Override
    public List<String> findDistinctCategorias() {
        return this.productoRepository.findDistinctCategorias();
    }
}