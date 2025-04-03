package com.example.mscompras.Controller;

import com.example.mscompras.Entity.Compra;
import com.example.mscompras.Service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/compras")
public class CompraController {
    @Autowired
    private CompraService compraService;

    @GetMapping
    public List<Compra> listar() {
        return compraService.listar();
    }

    @GetMapping("/{id}")
    public Optional<Compra> buscar(@PathVariable Long id) {
        return compraService.buscar(id);
    }

    @PostMapping
    public Compra guardar(@RequestBody Compra compra) {
        return compraService.guardar(compra);
    }

    @PutMapping("/{id}")
    public Compra actualizar(@PathVariable Long id, @RequestBody Compra compra) {
        return compraService.actualizar(id, compra);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        compraService.eliminar(id);
    }
}