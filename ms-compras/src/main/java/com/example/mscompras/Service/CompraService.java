package com.example.mscompras.Service;

import com.example.mscompras.Entity.Compra;
import java.util.List;
import java.util.Optional;

public interface CompraService {
    List<Compra> listar();
    Optional<Compra> buscar(Long id);
    Compra guardar(Compra compra);
    Compra actualizar(Long id, Compra compra);
    void eliminar(Long id);
}