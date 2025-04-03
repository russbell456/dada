package com.example.mscompras.Repository;

import com.example.mscompras.Entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CompraRepository extends JpaRepository<Compra, Long> {
    List<Compra> findByCategoria(String categoria);
}