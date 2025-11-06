package co.edu.unicauca.distribuidos.core.capaAccesoADatos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.edu.unicauca.distribuidos.core.capaAccesoADatos.models.ProductoEntity;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer> {
    
    @Query("SELECT p FROM ProductoEntity p WHERE p.categoria = :categoria")
    List<ProductoEntity> findByCategoria(@Param("categoria") String categoria);
    
    @Query("SELECT DISTINCT p.categoria FROM ProductoEntity p")
    List<String> findDistinctCategorias();
}