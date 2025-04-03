package com.example.mscompras.Service.impl;

import com.example.mscompras.Entity.Compra;
import com.example.mscompras.Repository.CompraRepository;
import com.example.mscompras.Service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraServiceImpl implements CompraService {
    @Autowired
    private CompraRepository compraRepository;

    @Override
    public List<Compra> listar() {
        return compraRepository.findAll();
    }

    @Override
    public Optional<Compra> buscar(Long id) {
        return compraRepository.findById(id);
    }

    @Override
    public Compra guardar(Compra compra) {
        return compraRepository.save(compra);
    }

    @Override
    public Compra actualizar(Long id, Compra compra) {
        compra.setId(id);
        return compraRepository.save(compra);
    }

    @Override
    public void eliminar(Long id) {
        compraRepository.deleteById(id);
    }
}
